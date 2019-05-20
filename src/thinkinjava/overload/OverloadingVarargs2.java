package thinkinjava.overload;

public class OverloadingVarargs2 {

    public static void main(String... args) {
        f(1, 'a');
//        f('a', 'b'); // 编译期间报错， 与两个方法都匹配
//        f();
    }

    static void f(float i, Character... characters) {
        System.out.println("first");
    }

    static void f(Character... characters) {
        System.out.println("third");
    }
}
