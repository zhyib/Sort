public class Insert {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                // Sorted array
                // If less than, move forward
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
