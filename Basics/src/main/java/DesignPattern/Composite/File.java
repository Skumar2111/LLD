package DesignPattern.Composite;

public class File implements FileSystemItem{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
