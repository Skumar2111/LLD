package immutability;

import java.util.ArrayList;
import java.util.List;

final class ImmutableStaff {

    private final String emp_id;
    private final String name;
    private final List<String> departments;


    ImmutableStaff(String emp_id, String name, List<String> departments) {
        this.emp_id = emp_id;
        this.name = name;
        // Immutability failure
        this.departments = departments;
    }

    public String getId()
    {
        return emp_id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableStaff{" +
                "emp_id='" + emp_id + '\'' +
                ", name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
