public class Count {
    public static void sort(int[] array, int max) {
        int[] temp = new int[max + 1];
        for (int value : array) {
            temp[value]++;
        }
        for (int i = 1; i < temp.length; i++) {
            temp[i] += temp[i - 1];
        }
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[--temp[array[i]]] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = ret[i];
        }
    }
}
