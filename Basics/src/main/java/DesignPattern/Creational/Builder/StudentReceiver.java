package DesignPattern.Creational.Builder;

public class StudentReceiver {

    private volatile Student student;


    public StudentReceiver() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                student = Builder.newInstance().setId(1)
                        .setName("Sushant").setAddress("Pune").build();

            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                student = Builder.newInstance().setId(2).setName("A").setAddress("Ranchi").build();
            }
        });

        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();
        } catch(InterruptedException exception)
        {
            exception.printStackTrace();
        }


    }

    public Student getStudent()
    {
        return student;
    }
}

