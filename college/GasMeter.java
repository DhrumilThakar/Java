import java.util.*;

public class GasMeter {
    private static double totalFuel = 0;
    private static double fuel95 = 0;
    private static double fuel98 = 0;
    private static double diesel = 0;

    public void refuel(int substance, double amount) {
        switch (substance) {
            case 1:
                fuel95 += amount;
                break;
            case 2:
                fuel98 += amount;
                break;
            case 3:
                diesel += amount;
                break;
        }
        totalFuel += amount;
    }

    public static void printTotalFuel() {
        System.out.println("Total used fuel: " + totalFuel);
    }

    public static void printFuel95() {
        System.out.println("Total used 95 octane fuel: " + fuel95);
    }

    public static void printFuel98() {
        System.out.println("Total used 98 octane fuel: " + fuel98);
    }

    public static void printDiesel() {
        System.out.println("Total used diesel fuel: " + diesel);
    }

    public static void main(String[] args) {
        GasMeter gasMeter = new GasMeter();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("what do you want: 1=95, 2=98, 3=Diesel (type any other number to quit): ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                break;
            }
            System.out.println("How much do you want to refuel: ");
            double amount = scanner.nextDouble();
            gasMeter.refuel(choice, amount);
        }
        printTotalFuel();
        printFuel95();
        printFuel98();
        printDiesel();
        scanner.close();
    }
}