import java.util.Arrays;
import java.util.Random;

public class Quick {
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = partition(array, left, right);
        quickSort(array, left, mid - 1);
        quickSort(array, mid + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        Random random = new Random();
        int index = random.nextInt(right - left + 1) + left;
        int pivot = array[index];
        swap(array, left, index);

        int mid = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] <= pivot) {
                swap(array, i, mid);
                mid++;
            }
        }
        swap(array, mid - 1, left);
        return mid - 1;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
