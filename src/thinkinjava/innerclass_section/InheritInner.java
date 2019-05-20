package thinkinjava.innerclass_section;

class WithInner {
    class Inner {

    }
}

/**
 * InheritInner 只继承内部类，而不是外围类。
 * 但是当要生成一个构造器时， 默认地构造器并不能正常工作，
 * 而且不能只是传递一个指向外围类对象地引用。
 * 此外， 必须在构造器内使用如下语法：
 * enclosingClassReference.super();
 * 这样才提供了必要地引用， 程序才能编译通过
 */
public class InheritInner extends WithInner.Inner{

    //! InheritInner() {} // Won't compile

    public InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}


