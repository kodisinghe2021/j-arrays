import java.util.Arrays;

public class ArraySwap {
    public static int [] swap_array(int []demo_array){
        for (int i = 0; i < demo_array.length / 2; i++) {
            int remainder;
            remainder = demo_array[i];
            demo_array[i] = demo_array[(demo_array.length - 1) - i];
            demo_array[(demo_array.length - 1) - i] = remainder;
        }
        return demo_array;
    }
    public static void main(String[] args) {
        // array to swap
        int[] given_array = {2, 5, 4, 76, -7, -3, 0, 9};
        // current array
        System.out.println(Arrays.toString(given_array));
        //after swapped
        System.out.println(Arrays.toString(swap_array(given_array)));
    }
}
