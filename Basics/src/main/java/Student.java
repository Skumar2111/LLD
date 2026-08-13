public class Student {

    /* States */
    String id;
    String name;
    int division;
    char section;

    /* Constructor */

    public Student(String id, String name, int division, char section) {
        this.id = id;
        this.name = name;
        this.division = division;
        this.section = section;
    }


    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getDivision() {
        return division;
    }

    private void setDivision(int division) {
        this.division = division;
    }

    public char getSection() {
        return section;
    }

    private void setSection(char section) {
        this.section = section;
    }

    public void read()
    {
        System.out.println(name+ " is reading ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", division=" + division +
                ", section=" + section +
                '}';
    }
}
