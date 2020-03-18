import java.util.ArrayList;
import java.util.Arrays;

public class Bucket {
    public static void sort(int[] array, int maxDigit) {
        int[][] lists = new int[10][array.length];
        int[] order = new int[10];

        int divide = (int)Math.pow(10, maxDigit - 1);
        for (int value : array) {
            lists[value / divide][order[value / divide]] = value;
            order[value / divide]++;
        }
        for (int[] list : lists) {
            Quick.sort(list);
        }
        int index = 0;
        for (int[] list : lists) {
            for (int value : list) {
                if (value != 0) {
                    array[index++] = value;
                }
            }
        }
    }
}
