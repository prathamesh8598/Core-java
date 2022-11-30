package Methods;

import java.util.Scanner;

public class EvenorOdd {
    int num;

    void evenodd(){
        if (num % 2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }
    }

    public static void main(String[] args) {
        EvenorOdd evenorOdd = new EvenorOdd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        evenorOdd.num=scanner.nextInt();
        evenorOdd.evenodd();
    }
}
