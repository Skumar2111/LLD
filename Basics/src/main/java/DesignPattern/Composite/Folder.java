package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }


    public void add(FileSystemItem item) {
        items.add(item);
    }


    @Override
    public void show() {

        System.out.println(name);

        for(int i = 0 ; i < items.size(); i++)
        {
            items.get(i).show();
        }
    }
}
