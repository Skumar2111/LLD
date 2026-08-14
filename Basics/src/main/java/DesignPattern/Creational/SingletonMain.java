package DesignPattern.Creational;

public class SingletonMain {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        Singleton singleton3 = Singleton.getInstance();


        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());

        if((singleton1 == singleton2) && singleton2 == singleton3)
        {
            System.out.println("We all are same instance");
        }
        else
        {
            System.out.println("OOPS!! we are not same");
        }

    }
}
