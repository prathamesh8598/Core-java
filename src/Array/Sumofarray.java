package Array;

public class Sumofarray {
    public static void main(String[] args) {
        int[] array={41,23,45,86,95};
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
