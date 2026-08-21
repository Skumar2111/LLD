package DesignPattern.Composite;

public class CompositeMain {

    public static void main(String[] args) {

        File file1 = new File("Resume");
        File file2 = new File("cv");

        Folder folder = new Folder("MyDocs");

        folder.add(file1);
        folder.add(file2);

        folder.show();
    }
}
