package ClassandObject;

public class Employee {
    String name;
    int yearJoining;
    String address;

    public Employee(String name, int yearJoining,String address) {
        this.name = name;
        this.yearJoining = yearJoining;
        this.address=address;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Robert",1994,"64C-WallsStreat");
        System.out.print("   "+employee.name);
        System.out.print("   "+employee.yearJoining);
        System.out.print("   "+employee.address);
        System.out.println();
        Employee employee1 = new Employee("sam",2000,"68D-WallsStreat");
        System.out.print("   "+employee1.name);
        System.out.print("      "+employee1.yearJoining);
        System.out.print("   "+employee1.address);
        System.out.println();
        Employee employee2 = new Employee("John",1999,"26B-WallsStreat");
        System.out.print("   "+employee2.name);
        System.out.print("     "+employee2.yearJoining);
        System.out.print("   "+employee2.address);
    }
}
