package ClassandObject;

public class Triangle {
    int a=3;
    int b=4;
    int c=5;
    double area;
    int perimeter;

   void setPerimeter(){
       perimeter=a+b+c;
       System.out.println("Perimeter of triangle :"+perimeter);
   }
   void setArea(){
       area=0.5*a*b;
       System.out.println("Area of triangle :"+area);
   }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.setArea();
        triangle.setPerimeter();
    }
}

