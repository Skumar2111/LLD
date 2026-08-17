package DesignPattern.AbstractFactory;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling SEDAN");
    }
}
