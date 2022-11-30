package CollectionImp;

public class Employee implements Comparable<Employee> {
    int salary;
    int age;
    String name;

    public Employee() {
    }

    public Employee(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.salary-this.salary;
    }
}
