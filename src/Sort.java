import java.util.Arrays;
import java.util.Random;

public class Sort {
    private final static int ARRAY_SIZE = 500000;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(ARRAY_SIZE);
        }

//        Bubble.sort(array);
//        Insert.sort(array);
//        Select.sort(array);
//        Merge.sort(array);
        Heap.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
