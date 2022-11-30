package ClassandObject;

import java.util.Scanner;

public class Employees {
    int salary;
    int hours;



    public void AddSal(){
        if (salary < 500){
            salary=salary+10;
            System.out.println("total salary is :"+salary);
        }
    }

    public void Addwork(){
        if (hours > 6){
            salary=salary+5;
            System.out.println("Total salary is :"+salary);
        }
    }


    public static void main(String[] args) {
        Employees employees = new Employees();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary");
        employees.salary=scanner.nextInt();
        System.out.println("Enter the working hours");
        employees.hours=scanner.nextInt();
        employees.AddSal();
        employees.Addwork();
    }
}
