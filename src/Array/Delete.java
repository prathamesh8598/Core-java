package Array;

public class Delete {
    public static void main(String[] args) {
        int[] array={14,51,24,36,78};

        for (int i = 0; i < array.length; i++) {
            for(int j=0;j< array.length-1;j--){
               array[i]=array[j];

            }
        }
    }
}
