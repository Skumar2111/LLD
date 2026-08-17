package DesignPattern.Builder;

public class Builder {

    protected int id;
    protected String name;
    protected String address;

    public static Builder newInstance()
    {
        return new Builder();
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    private Builder(){};


    public Student build()
    {
        return new Student(this);
    }


    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
