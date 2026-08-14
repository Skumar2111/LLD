package immutability;

import java.util.ArrayList;
import java.util.List;

public class StaffMain {

    public static void main(String[] args) {

        List<String> dept = new ArrayList<>();
        dept.add("CSE");
        dept.add("MECH");

        /* Once Object is created no change to it */
        ImmutableStaff immutableStaff = new ImmutableStaff("123","Sushant",dept);

      //  immutableStaff.getDepartments().add("MECH");
        System.out.println(immutableStaff.toString());

    }

}
