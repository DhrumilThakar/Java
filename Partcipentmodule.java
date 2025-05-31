import java.util.*;
import java.text.*;

class Participant {
    String name, email;
    int age;

    Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    
    public String toString() {
        return name + ", " + age + ", " + email;
    }
}

class Event {
    String name, date, time, location, organizer;
    int maxParticipants;
    List<Participant> participants = new ArrayList<>();

    Event(String name, String date, String time, String location, String organizer, int maxParticipants) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.organizer = organizer;
        this.maxParticipants = maxParticipants;
    }

   
    public String toString() {
        return name + ", " + date + ", " + time + ", " + location + ", " + organizer + ", " + maxParticipants;
    }
}

public class EventManager {
    static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Event 2. View Events 3. Search Event 4. Register Participant 5. View Participants 6. Search Participant 7. Exit");
            switch (sc.nextInt()) {
                case 1 -> addEvent(sc);
                case 2 -> viewEvents();
                case 3 -> searchEvent(sc);
                case 4 -> registerParticipant(sc);
                case 5 -> viewParticipants(sc);
                case 6 -> searchParticipant(sc);
                case 7 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addEvent(Scanner sc) {
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        if (name.isEmpty()) { System.out.println("Event Name required."); return; }

        System.out.print("Date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        if (!isFutureDate(date)) { System.out.println("Date must be in the future."); return; }

        System.out.print("Time (HH:mm): ");
        String time = sc.nextLine();
        if (!isValidTime(time)) { System.out.println("Time must be in 24-hour format."); return; }

        System.out.print("Location: ");
        String location = sc.nextLine();
        System.out.print("Organizer: ");
        String organizer = sc.nextLine();
        System.out.print("Max Participants: ");
        int maxParticipants = sc.nextInt();
        if (maxParticipants <= 0) { System.out.println("Max Participants must be positive."); return; }

        events.add(new Event(name, date, time, location, organizer, maxParticipants));
        System.out.println("Event added successfully.");
    }

    private static void viewEvents() {
        if (events.isEmpty()) System.out.println("No events found.");
        else events.forEach(System.out::println);
    }

    private static void searchEvent(Scanner sc) {
        System.out.print("Search by Name/Date: ");
        sc.nextLine();
        String searchTerm = sc.nextLine();
        boolean found = false;
        for (Event event : events) {
            if (event.name.equalsIgnoreCase(searchTerm) || event.date.equals(searchTerm)) {
                System.out.println(event);
                found = true;
            }
        }
        if (!found) System.out.println("No matching events found.");
    }

    private static void registerParticipant(Scanner sc) {
        System.out.print("Event Name: ");
        sc.nextLine();
        String eventName = sc.nextLine();
        Event event = getEventByName(eventName);
        if (event == null) { System.out.println("Event not found."); return; }
        if (event.participants.size() >= event.maxParticipants) { System.out.println("Participant limit reached."); return; }

        System.out.print("Participant Name: ");
        String name = sc.nextLine();
        if (name.isEmpty()) { System.out.println("Participant Name required."); return; }

        System.out.print("Age: ");
        int age = sc.nextInt();
        if (age < 18 || age > 100) { System.out.println("Age must be between 18 and 100."); return; }

        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        if (!isValidEmail(email)) { System.out.println("Invalid email format."); return; }

        event.participants.add(new Participant(name, age, email));
        System.out.println("Participant registered successfully.");
    }

    private static void viewParticipants(Scanner sc) {
        System.out.print("Event Name: ");
        sc.nextLine();
        String eventName = sc.nextLine();
        Event event = getEventByName(eventName);
        if (event == null) { System.out.println("Event not found."); return; }

        if (event.participants.isEmpty()) System.out.println("No participants registered.");
        else event.participants.forEach(System.out::println);
    }

    private static void searchParticipant(Scanner sc) {
        System.out.print("Participant Name: ");
        sc.nextLine();
        String participantName = sc.nextLine();
        boolean found = false;
        for (Event event : events) {
            for (Participant participant : event.participants) {
                if (participant.name.equalsIgnoreCase(participantName)) {
                    System.out.println("Event: " + event.name + ", " + participant);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Participant not found.");
    }

    private static Event getEventByName(String name) {
        for (Event event : events) {
            if (event.name.equalsIgnoreCase(name)) return event;
        }
        return null;
    }

    private static boolean isFutureDate(String date) {
        try {
            Date eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            return eventDate.after(new Date());
        } catch (ParseException e) {
            return false;
        }
    }

    private static boolean isValidTime(String time) {
        try {
            new SimpleDateFormat("HH:mm").parse(time);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private static boolean isValidEmail(String email) {
        return email.ma;
    }
}
