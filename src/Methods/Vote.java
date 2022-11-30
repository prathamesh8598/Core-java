package Methods;

import java.util.Scanner;

public class Vote {
    int age;

    void vote(){
        if (age >= 18){
            System.out.println("Person is eligible for vote");
        }
        else {
            System.out.println("Person is not eligible for vote");
        }
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        vote.age= scanner.nextInt();
        vote.vote();
    }
}
