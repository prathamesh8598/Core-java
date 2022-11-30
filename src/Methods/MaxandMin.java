package Methods;

import java.util.Scanner;

public class MaxandMin {
    int num1;
    int num2;
    int num3;
    int maximum;
    int minimum;
    int large;
    int small;

    public void maximum(){
        large=num1>num2?num1:num2;
        maximum=num3>large?num3:large;
        System.out.println("The maximum number is :"+maximum);
    }
    public void minimum(){
        small=num1<num2?num1:num2;
        minimum=num3<small?num3:small;
        System.out.println("The minimum number is :"+minimum);
    }

    public static void main(String[] args) {
        MaxandMin maxandMin = new MaxandMin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        maxandMin.num1=scanner.nextInt();
        System.out.println("Enter the second number");
        maxandMin.num2=scanner.nextInt();
        System.out.println("Enter the third number");
        maxandMin.num3=scanner.nextInt();
        maxandMin.maximum();
        maxandMin.minimum();
    }
}
