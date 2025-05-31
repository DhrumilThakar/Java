package participant;
import event.Event;
import event.EventManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParticipantManager {
    private HashMap<String, List<Participant>> participantsMap = new HashMap<>();
    private EventManager eventManager;

    public ParticipantManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public String registerParticipant(String eventName, String participantName, int age, String email) {
        List<Participant> participants = participantsMap.getOrDefault(eventName, new ArrayList<>());
        Event event = eventManager.viewEvents().stream()
                .filter(e -> e.getName().equalsIgnoreCase(eventName))
                .findFirst()
                .orElse(null);

        if (event == null) {
            return "Event not found!";
        }
        if (participants.size() >= event.getMaxParticipants()) {
            return "Participant limit reached!";
        }
        Participant participant = new Participant(eventName, participantName, age, email);
        participants.add(participant);
        participantsMap.put(eventName, participants);
        return "Registration successful!";
    }

    public List<Participant> viewParticipants(String eventName) {
        return participantsMap.getOrDefault(eventName, new ArrayList<>());
    }

    public List<String> searchParticipant(String participantName) {
        List<String> events = new ArrayList<>();
        for (String event : participantsMap.keySet()) {
            for (Participant participant : participantsMap.get(event)) {
                if (participant.getName().equalsIgnoreCase(participantName)) {
                    events.add(event);
                }
            }
        }
        return events;
    }
}