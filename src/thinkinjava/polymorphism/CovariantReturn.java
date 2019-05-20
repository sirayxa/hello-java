package thinkinjava.polymorphism;

/**
 * 协变返回类型， 子类中的override方法可以返回 基类被覆盖方法的 返回类型的某种子类型
 */
public class CovariantReturn {

    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);

        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}


