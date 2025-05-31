package EventManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events = new ArrayList<>();

    public String addEvent(String name, LocalDateTime dateTime, String location, String organizer, int maxParticipants) {
        Event event = new Event(name, dateTime, location, organizer, maxParticipants);
        events.add(event);
        return "Event added successfully!";
    }

    public List<Event> viewEvents() {
        return events;
    }

    public List<Event> searchEvent(String s) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(s) || event.getDateTime().toString().contains(s)) {
                result.add(event);
            }
        }
        return result;
    }
}