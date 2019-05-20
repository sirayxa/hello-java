package thinkinjava.innerclass_section.greenhouse;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        while (eventList.size() > 0) {
            // Make a copy so you're not modifying the list
            // while you're selecting the elements in it:
            for (Event event: new ArrayList<>(eventList)) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
