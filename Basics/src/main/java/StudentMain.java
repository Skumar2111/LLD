import java.lang.reflect.InvocationTargetException;

public class StudentMain {

    public static void main(String[] args) {
/*
        Creation of Object
        Student student = new Student("1","Sushant",10,'A');
*/

        // Creation of instance using Reflection
        try {
            Class<?> c = Class.forName("Student");

            c.getMethods();
            Student student = (Student) c.getDeclaredConstructor(String.class,String.class,Integer.class,Character.class).newInstance("1","Sushant",10,'A');



            student.read();

            System.out.println(student.printingInfo());

            student.doingOperations();

            student.genericMethod();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
