package thinkinjava.overload;

/**
 * 你应该总是只在重载方法的一个版本上使用可变参数列表， 或者压根就不使用它
 */
public class OverloadingVarargs3 {

    public static void main(String... args) {
        f(1, 'a');
        f('a', 'b');
    }

    static void f(float i, Character... characters) {
        System.out.println("first");
    }

    static void f(char c, Character... characters) {
        System.out.println("third");
    }
}
