package thinkinjava.exception_section;

import thinkinjava.PrintUtils;

class SimpleException extends Exception {

}

class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        // 明确调用父类构造器
        super(message);
    }
}


/**
 * Inherit 继承
 */
public class InheritingExceptions {

    public static void f1() throws MyException {
        PrintUtils.println("Throwing MyException form f1()");
        throw new MyException();
    }

    public static void g() throws MyException {
        PrintUtils.println("Throwing MyException form g()");
        throw new MyException("Originated in g()");
    }

    public void f() throws SimpleException { // 声明该方法应该抛出该异常
        PrintUtils.println("Throw SimpleException form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            // 静态方法里面如果需要调用非静态方法， 就需要创建对象来调用
            sed.f();
        } catch (SimpleException ex) { // 该异常只有在try块中存在才能捕获
            PrintUtils.println("Caught it !");
        }

        try {
            f1();
        } catch (MyException ex) {
            ex.printStackTrace(); // 将信息输出到标准错误流
            ex.printStackTrace(System.out); // 将信息发送到System.out， 并自动地被捕获和显示在输出中
        }

        try {
            g();
        } catch (MyException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
