package DesignPattern.Creational;

public class Singleton {

    private static Singleton singleInstance = null;

    public String string;

    private Singleton() {
        string = "I am the one and only string singleton Object";
    }

    public static synchronized Singleton getInstance()
    {
        if(singleInstance == null)
        {
            singleInstance = new Singleton();
        }

        return singleInstance;
    }
}
