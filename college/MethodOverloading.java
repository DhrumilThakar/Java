import java.util.Scanner;

public class MethodOverloading {
    public String Method1(String s1) {
        String[] space = s1.split(" ");
        if (space.length < 3) {
            // s1 = s1.replace("a", "z");
            s1 = s1.replace("A", "Z");
        }

        return s1;
    }

    public String Method1(String s1, String CHARUSAT) {
        String[] words = s1.split("\\s+");
        if (words.length >= 2) {
            words[1] = CHARUSAT;
            s1 = String.join(" ", words);
        } else {
            System.out.println("The input string has less than three words.");
        }
        return s1;
    }

    public String Method1(String s1, int num) {
        String[] space = s1.split(" ");
        if (num >= 10 && space.length >= 2) {
            s1 = s1.toLowerCase();
        }
        return s1;
    }

    public static void main(String[] args) {
        String C = "Charusat";
        MethodOverloading m = new MethodOverloading();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string  : ");
        String sc = s.nextLine();
        System.out.println(m.Method1(sc));
        System.out.println(m.Method1(sc, C));
        int n = sc.length();
        System.out.println(m.Method1(sc, n));
        s.close();
    }

}