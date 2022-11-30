package Array;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int sum=0;
        int temp=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize= scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter the array element");
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();

        }
        for (int index = 0; index < array.length; index++) {
           if (array[index]<=100){
               sum=sum+array[index];
           }
        }
        System.out.println(sum);
    }
}
