package ClassandObject;

public class Rectangle {
    int length;
    int breadth;
    int area;

    public Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public int getArea(){
        area=length*breadth;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area of rectangle :"+rectangle.getArea());
        Rectangle rectangle1 = new Rectangle(5,8);
        System.out.println("Area of rectangle :"+rectangle1.getArea());

    }
}
