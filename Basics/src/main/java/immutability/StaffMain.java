package immutability;

import java.util.ArrayList;
import java.util.List;

public class StaffMain {

    public static void main(String[] args) {

        List<String> dept = new ArrayList<>();
        dept.add("CSE");
        ImmutableStaff immutableStaff = new ImmutableStaff("123","Sushant",dept);
        dept.add("MECH");
        System.out.println(immutableStaff.toString());

    }

}
