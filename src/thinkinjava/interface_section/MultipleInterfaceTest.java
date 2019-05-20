package thinkinjava.interface_section;

public class MultipleInterfaceTest {

}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    /**
     * ActionCharacter 和 CanFight里面同时存在， 此时接口fight()被ActionCharacter中的fight()方法 重写/覆盖 了
     */
//    @Override
//    public void fight() {
//        super.fight();
//    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}