package DesignPattern.Builder;

public class Student {

    int studentId;
    String name;
    String address;

    public Student(Builder builder) {

        this.studentId = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
