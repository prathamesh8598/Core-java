package Methods;

import java.util.Scanner;

public class Factor {
    int num;

    void factor(){
        for (int i=2;i<=num;i++){
            while (num % i==0){
                num=num/i;
            }
        }
        if (num<2){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Factor factor = new Factor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        factor.num= scanner.nextInt();
        factor.factor();

    }
}
