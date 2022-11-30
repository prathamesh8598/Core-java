package Methods;

import java.util.Scanner;

public class Marks {
    int marks;

    void marks(){
        if (marks>=91 && marks<=100){
            System.out.println("AA");
        }
        if (marks>=81 && marks<=90){
            System.out.println("AB");
        }
        if (marks>=71 && marks<=80){
            System.out.println("BB");
        }
        if (marks>=61 && marks<=70){
            System.out.println("BC");
        }
        if (marks>=51 && marks<=60){
            System.out.println("CD");
        }
        if (marks>=41 && marks<=50){
            System.out.println("DD");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Marks marks1 = new Marks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        marks1.marks= scanner.nextInt();
        marks1.marks();
    }
}
