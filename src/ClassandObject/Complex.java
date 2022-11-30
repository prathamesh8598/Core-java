package ClassandObject;

public class Complex {
    int num1;
    int num2;
    int num3;
    int num4;
    int sum;
    int product;
    int difference;

    public Complex(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

     void getSum(){
        System.out.println("Sum of complex numbers is :"+num1+num2);
        System.out.println("sum of imaginary numbers is i+"+num3+num4);
    }
     void getDifference(){
        System.out.println("Differnece of complex numbers is :"+(num1*num2));
        System.out.println("Differnece of imaginary numbers is :i+"+(num3+num4));
    }
    void setProduct(){
        System.out.println("Product of complex numbers are :"+(num1*num2));
        System.out.println("Product of complex numbers are :i+"+(num3*num4));
    }

    public static void main(String[] args) {
        Complex complex = new Complex(4,5,6,7);
        complex.getSum();
        complex.getDifference();
        complex.setProduct();
    }
}
