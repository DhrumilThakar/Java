import java.util.*;

interface Recyclable {
    void recycle();
}

class Bottle {
    protected double capacity;

    public Bottle(double capacity) {
        this.capacity = capacity;
    }

    public double returnCapacity() {
        return capacity;
    }
}

class SodaBottle extends Bottle implements Recyclable {
    private String sodaName;

    public SodaBottle(String sodaName, double capacity) {
        super(capacity);
        this.sodaName = sodaName;
    }

    @Override
    public void recycle() {
        System.out.println("Bottle returned for recycling");
    }

    @Override
    public String toString() {
        return sodaName + " " + capacity + " liters";
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the name of the soda : ");
        String sodaName = scanner.nextLine();
        System.out.print("Type the volume of the soda (in liters) : ");
        double capacity = scanner.nextDouble();
        SodaBottle sodaBottle = new SodaBottle(sodaName, capacity);
        System.out.println(sodaBottle.toString());
        sodaBottle.recycle();
        scanner.close();
    }
}