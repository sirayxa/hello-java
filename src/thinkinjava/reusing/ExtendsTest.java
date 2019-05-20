package thinkinjava.reusing;

public class ExtendsTest {

    private String mAge;

    public ExtendsTest() {
        System.out.println("invoke parent's constructor " + this);
    }

    public ExtendsTest(String age) {
        this.mAge = age;
    }

    private void functionP() {
        System.out.println("invoked parent's functionP");
    }
}

// 同一个文件内， 只能存在一个public的类， 并且类无法定义为private、protect
class Child extends ExtendsTest {

    private String mName;

    public Child() {
        // 子类中默认会调用父类的无参构造函数， 如果父类不存在默认构造函数， 则必选显示调用父类其他的的构造函数
        System.out.println("invoke child's constructor " + this);
    }
    public Child(String name) {
        mName = name;
    }


    public static void main(String[] args) {
        // 对象的创建只能通过new关键字创建
        // 创建子类时， 不会创建父类对象， 只是会调用父类的构造函数进行初始化操作
        Child child = new Child();
        child = new Child("shilei");
    }
}
