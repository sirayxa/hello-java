package thinkinjava.reusing;

public class DelegationTest {

}

class SpaceShipControls {
    void up(int velocity) {}
    void down(int velocity){}
    void left(int velocity) {}
    void right(int velocity) {}
    void forward(int velocity) {}
    void turboBoost(int velocity) {}
}

class SpaceShipDelegation {
    private String mName;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.mName = name;
    }

    // Delegated methods
    public void up(int velocity) {
        controls.up(velocity);
    }
}
