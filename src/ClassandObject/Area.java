package ClassandObject;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;
    int area;


    public int setDim(){
        area=length*breadth;
        return area;
    }

    void getArea(){
        System.out.println("Area of rectangle :"+setDim());
    }

    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length");
        area.length=scanner.nextInt();
        System.out.println("Enter the breadth");
        area.breadth=scanner.nextInt();
        area.getArea();
    }

}
