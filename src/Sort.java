import java.util.Arrays;
import java.util.Random;

public class Sort {
    private final static int ARRAY_SIZE = 500000;

    public static void main(String[] args) {
        int[] array = {25, 11, 36, 61, 59, 45, 56, 12, 72, 75, 27, 64};
//        int[] array = generate();
//        int max = 6;
        int maxDigit = 2;

//        Bubble.sort(array);
//        Insert.sort(array);
//        Select.sort(array);
//        Merge.sort(array);
//        Heap.sort(array);
//        Count.sort(array, max);
//        Quick.sort(array);
//        Radix.sort(array, maxDigit);
//        Bucket.sort(array, maxDigit);
        Shell.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] generate() {
        int[] array = new int[ARRAY_SIZE];
        int max = Integer.MIN_VALUE;

        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
            max = Math.max(array[i], max);
        }
        return array;
    }
}
