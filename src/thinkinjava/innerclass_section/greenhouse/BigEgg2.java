package thinkinjava.innerclass_section.greenhouse;

class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    private Yolk mYolk = new Yolk();

    public Egg2() {
        System.out.println("New Egg2()");
    }

    public void insertYolk(Yolk yolk) {
        mYolk = yolk;
    }

    public void g() {
        mYolk.f();
    }
}
public class BigEgg2 extends Egg2{

    public class Yolk extends Egg2.Yolk {
        //
        public Yolk() {
            // 这里会调用父类默认地构造函数 super();
            System.out.println("BigEgg2.Yolk()");
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() {
        // 这里会调用父类默认地构造函数 super();
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        // 该代码块创建了几个对象， 这几个对象间地引用关系是什么？
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}
