package event;

import java.time.LocalDateTime;

public class Event {
    private String name;
    private LocalDateTime dateTime;
    private String location;
    private String organizer;
    private int maxParticipants;

    public Event(String name, LocalDateTime dateTime, String location, String organizer, int maxParticipants) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.organizer = organizer;
        this.maxParticipants = maxParticipants;
    }


    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLocation() {
        return location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }
}