public class Shell {
    public static void sort(int[] array) {
        int length = array.length;
        for (int gap = length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < length; i++) {
                int j = i;
                int current = array[i];
                while (j - gap >= 0 && current < array[j - gap]) {
                    array[j] = array[j - gap];
                    j = j - gap;
                }
                array[j] = current;
            }

        }
    }
}
