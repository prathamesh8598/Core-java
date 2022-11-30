package ClassandObject;

public class Triangles {
    int a;
    int b;
    int c;
    double area;
    int perimeter;

    public Triangles(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void setArea(){
        area=0.5*a*b;
        System.out.println("Area of triangle :"+area);
    }
    void setPerimeter(){
        perimeter=a+b+c;
        System.out.println("Perimeter of triangle :"+perimeter);
    }

    public static void main(String[] args) {
        Triangles triangles = new Triangles(3,4,5);
        triangles.setArea();
        triangles.setPerimeter();
    }
}