import java.util.Arrays;

public class Radix {
    public static void sort(int[] array, int maxDigit) {
        int divide = 1;
        int[][] temp = new int[10][array.length];
        int[] order = new int[10];

        for (int i = 0; i < maxDigit; i++, divide *= 10) {
            for (int value : array) {
                int lastDigit = (value / divide) % 10;
                // 行 位上的数字
                // 列 数字对应的数量
                // 存储 数字
                temp[lastDigit][order[lastDigit]] = value;
                order[lastDigit]++;
            }
            int index = 0;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (temp[j][k] != 0) {
                        array[index++] = temp[j][k];
                        temp[j][k] = 0;
                    } else {
                        break;
                    }
                }
                order[j] = 0;
            }
        }
    }
}
