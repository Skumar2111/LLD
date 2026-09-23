package DesignPattern.singleton;

public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton()
    {
        s = "Singleton";
    }

    public static synchronized Singleton getInstance()
    {
        if(single_instance == null)
        {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}
