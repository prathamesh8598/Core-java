package ClassandObject;

import java.util.Scanner;

public class Average {
    int num1;
    int num2;
    int num3;
    int average;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    int getAverage(){
        average=(num1+num2+num3)/3;
        System.out.println("Average :"+average);
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number");
        num1=scanner.nextInt();
        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        System.out.println("Enter the third number");
        num3=scanner.nextInt();
        Average average1 = new Average(num1,num2,num3);
        average1.getAverage();
    }
}
