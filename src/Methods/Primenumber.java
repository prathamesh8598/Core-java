package Methods;

public class Primenumber {
    int num;
    int count;

    public Primenumber(int num) {
        this.num = num;
    }

    void prime(){
        for (int i=1;i<=num;i++){
            if (num % i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is an prime number");
        }
        else {
            System.out.println("Its not an prime number");
        }
    }

    public static void main(String[] args) {
        Primenumber primenumber = new Primenumber(5);
        primenumber.prime();
    }
}
