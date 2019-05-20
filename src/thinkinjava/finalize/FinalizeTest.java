package thinkinjava.finalize;

public class FinalizeTest {
    public static void main(String[] str) {

        // 所有book对象在垃圾回收前都应该被checkIn
        Book novel = new Book(true);
        novel.checkIn();

        // 程序疏忽， 导致有一本书未被checkIn
        new Book(true);

        // 强制执行垃圾回收
        System.gc();
    }
}
