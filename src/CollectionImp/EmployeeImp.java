package CollectionImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeImp {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10000,25,"abc");
        Employee employee2 = new Employee(5000,27,"pqr");
        Employee employee3 = new Employee(17000,26,"xyz");
        Employee employee4 = new Employee(25000,32,"efg");
        Employee employee5 = new Employee(1000,20,"lmn");

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        //System.out.println(list+"/n");
        for (Object emp :list) {
            System.out.println(emp+"\n");
        }
        Collections.sort(list,(e1,e2)->e1.salary- e2.salary);
        System.out.println(list);

       // List<Employee>list1=new ArrayList<>();
        for (Employee emp1: list) {
            if (emp1.salary>=10000&&emp1.name.charAt(1)=='y')
            {
                System.out.println(emp1);
            }
        }


    }
}
