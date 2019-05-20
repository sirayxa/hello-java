package thinkinjava.innerclass_section.greenhouse;

/**
 * 内部类可以解决无法多重继承问题， 或者两个接口中方法签名相同而引发地冲突问题
 *
 * 控制温室的运作： 控制灯光、水、温度调节器的开关， 以及响铃和重新启动系统
 */
public class GreenhouseControls extends Controller {

    private boolean light = false;
    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn on the light.
            light = true; // 内部类能够自由地访问外部类地域， 无需限定条件或特殊许可
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn on the light.
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here.
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here.
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day"; // 恒温器

    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }

        @Override
        public void action() {
            thermostat = "Night";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }

        @Override
        public void action() {
            thermostat = "Day";
        }
    }

    // An example of an action() that inserts a new one of itself into the event list:
    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Bing!";
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
    }

    public class Restart extends Event {

        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e: eventList) {
                addEvent(e);
            }
        }

        @Override
        public String toString() {
            return "Restarting system";
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // Rerun each event
                addEvent(e);
            }

            start(); // Rerun this Event
            addEvent(this);
        }
    }

    // 如果不需要引用外部类的域， 可以直接声明为static
    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Terminating";
        }

        @Override
        public void action() {
            System.exit(0);
        }
    }
}
