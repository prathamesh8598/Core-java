package Methods;

public class Circle {
    int radius;
    double circumference;
    double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    void Circumference(){
        circumference=2*Math.PI*radius;
        System.out.println("Circumference is :"+circumference);
    }
    void area(){
        area=Math.PI*radius*radius;
        System.out.println("Area of circle is :"+area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.Circumference();
        circle.area();
    }
}
