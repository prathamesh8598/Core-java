package ClassandObject;

import java.util.Scanner;

public class Areas {
    int length;
    int breadth;
    int area;

    public Areas(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     int returnArea(int length,int breadth){
        area=length*breadth;
        return area;
    }
    void getArea(){
        System.out.println("Area of rectangle :"+returnArea(length,breadth));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length,breadth;
        System.out.println("Enter the length");
        length=scanner.nextInt();
        System.out.println("Enter the breadth");
        breadth=scanner.nextInt();
        Areas areas = new Areas(length,breadth);
        areas.getArea();
    }
}
