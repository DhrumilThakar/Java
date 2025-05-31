import java.util.*;

interface Recyclable {
    void recycle();

    default void InvalidInput() {
        System.out.println(" Give proper Input");
    }
}

class Fabric implements Recyclable {
    public void recycle() {
        System.out.println("Fabric is recycled");
    }
}

class Bottel implements Recyclable {
    public void recycle() {
        System.out.println("Bottel is recycled");
    }
}

class Paper implements Recyclable {
    public void recycle() {
        System.out.println("Paper is recycled");
    }
}

public class practical3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Recyclable[] r = { new Fabric(), new Bottel(), new Paper() };

        while (true) {
            System.out.println(
                    "What do you want to recycle? Choose a number.\n1=>Clothes\n2=>Bottles\n3=>News Papers\n4=>Exit");
            System.out.print("Choose a number: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1, 2, 3 -> r[choice - 1].recycle();
                case 4 -> {
                    System.out.println("Thanks for coming ...");
                    s.close();
                    return;
                }
                default -> r[0].InvalidInput();
            }
        }
    }
}
