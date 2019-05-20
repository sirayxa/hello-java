package thinkinjava.overload;

public class OverloadingVarargs {

    public static void main(String... args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
//        f();  // Won't compile -- ambiguous 暧昧的
    }
    static void f(Character... characters) {
        System.out.print("first");
        for (Character c : characters) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... integers) {
        System.out.print("second");
        for (Integer i : integers) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... longs) {
        System.out.println("third");
    }
}
