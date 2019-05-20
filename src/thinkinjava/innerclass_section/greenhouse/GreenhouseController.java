package thinkinjava.innerclass_section.greenhouse;

public class GreenhouseController {

    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900)); // 创建内部类Bell时会默认持有gc对象地引用

        Event[] eventList = {
          gc.new ThermostatNight(0),
          gc.new LightOn(200),
          gc.new LightOff(400),
          gc.new WaterOn(600),
          gc.new WaterOff(800),
          gc.new ThermostatDay(1400)
        };

        // 首先会执行new Restart构造函数中地初始化操作， 然后再执行该addEvent操作
        gc.addEvent(gc.new Restart(2000, eventList));

        if (args.length == 1) {
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }

        gc.run();

    }
}
