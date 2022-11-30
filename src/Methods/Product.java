package Methods;

public class Product {
    int num1,num2;
    int product;

    public Product(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Product() {
        product=num1*num2;
        return product;
    }

    public static void main(String[] args) {
        Product product1 = new Product(5,6);
        System.out.println("Product is :"+product1.Product());
    }
}
