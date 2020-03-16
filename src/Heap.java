public class Heap {
    private static int length;

    public static void sort(int[] array) {
        buildMaxHeap(array);
        for (int i = length - 1; i >= 0; i--) {
            swap(array, i, 0);
            length--;
            heapify(array, 0);
        }
    }

    private static void buildMaxHeap(int[] array) {
        length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, i);
        }
    }

    private static void heapify(int[] array, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < length) {
            largest = array[largest] > array[left] ? largest : left;
        }
        if (right < length) {
            largest = array[largest] > array[right] ? largest : right;
        }
        if (largest != index) {
            swap(array, largest, index);
            heapify(array, largest);
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}