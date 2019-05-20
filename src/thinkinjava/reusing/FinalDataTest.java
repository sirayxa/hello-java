package thinkinjava.reusing;

import java.util.Random;

public class FinalDataTest {

}

class FinalData {
    private static Random rand = new Random();
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // Can be compile-time constants
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    // Typical public constant: public static final
    public static final int VALUE_THREE = 39;

    // Cannot be compile-time constants:
    private final int i4 = rand.nextInt(20); // 我们不能因为某数据是final的就认为在编译时可以知道它的值
    static final int INT_5 = rand.nextInt(20); // 编译期间， 不会生成对象，
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    // Arrays:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        // fd1.valueOne++; // Error: can't change value
        fd1.v2.i++; // Object isn't constant
        fd1.v1 = new Value(9); // OK -- not final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // Object isn't constant
        }

        // fd1.v2 = new Value(0); // Error: can't change reference
        // VAL_3 = new Value(1); // Error: Can't change reference
        // fd1.a = new int[3]; // Error: Can't change reference

        System.out.println(fd1.toString());
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1.toString());
        System.out.println(fd2.toString());

    }

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + " , INT_5 = " + INT_5;
    }
}

class Value {
    int i; // Package access

    public Value(int i) {
        this.i = i;
    }
}
