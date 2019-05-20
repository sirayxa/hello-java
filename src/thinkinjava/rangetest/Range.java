package thinkinjava.rangetest;

public class Range {

    public static void main(String[] args) {
        printIntArrays(range(10));
        printIntArrays(range(5, 10));
        printIntArrays(range(0, 10, 2));
    }

    public static void printIntArrays(int[] array) {
//        if (array.length <= 0) {
//            return;
//        }

        // Foreach 循环是安全的， 不需要判断数组长度是否大于0， 不会有数组下标越界的风险
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Produce a sequence [0..n]
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    // Produce a sequence [start..end]
    public static int[] range(int start, int end) {
        int size = end - start;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + i;
        }
        return result;
    }

    // Produce a sequence [start..end] incrementing by step
    public static int[] range(int start, int end, int step) {
        int size = (end - start) / step;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }

}
