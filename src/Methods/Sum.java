package Methods;

public class Sum {
    int num1,num2;
    int sum;

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void sum(){
        sum=num1+num2;
        System.out.println("Sum is :"+sum);
    }

    public static void main(String[] args) {
        Sum sum1 = new Sum(8,9);
        sum1.sum();
    }
}
