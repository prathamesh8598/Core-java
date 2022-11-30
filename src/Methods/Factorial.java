package Methods;

import java.util.Scanner;

public class Factorial {
    int num;
    int factorial=1;

    void  factorial(){
        for (int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial is :"+factorial);
    }

    public static void main(String[] args) {
        Factorial factorial1 = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        factorial1.num= scanner.nextInt();
        factorial1.factorial();
    }
}
