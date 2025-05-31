package participant;

public class participant {
    private String eventName;
    private String name;
    private int age;
    private String email;

    public participant(String eventName, String name, int age, String email) {
        this.eventName = eventName;
        this.name = name;
        this.age = age;
        this.email = email;
    }

     
    public String getEventName() {
        return eventName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}