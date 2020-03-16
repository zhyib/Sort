public class Merge {
    public static void sort(int[] array) {
        merge(array, 0, array.length-1);
    }

    private static void merge(int[] array, int left, int right) {
        if (right != left) {
            merge(array, left, (left + right) / 2);
            merge(array, (left + right) / 2 + 1, right);

            int mid = (left + right) / 2;
            int[] temp = new int[right - left + 1];
            int i = left;
            int j = mid + 1;
            int k = 0;
            while (i <= mid && j <= right) {
                if (array[i] < array[j]) {
                    temp[k++] = array[i++];
                } else {
                    temp[k++] = array[j++];
                }
            }
            while (i <= mid) {
                temp[k++] = array[i++];
            }
            while (j <= right) {
                temp[k++] = array[j++];
            }

            k = 0;
            for (int m = left; m <= right; m++) {
                array[m] = temp[k++];
            }
        }
    }
}
