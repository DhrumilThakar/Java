import java.util.*;

public class MorseCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--","-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        String[] words = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z" };
        System.out.println("Enter a choice to perform ");
        System.out.println("1. To convert string to Morse code ");
        System.out.println("2. To convert Morse code to string ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                System.out.print("Enter the string: ");
                String s = sc.nextLine().toUpperCase();
                String result = stringToMorse(s, words, morse);
                System.out.println("Morse code: " + result);
                break;
            case 2:
                System.out.print("Enter the Morse code: ");
                String s1 = sc.nextLine();
                result = morseToString(s1, words, morse);
                System.out.println("String: " + result);
                break;
            default:
                break;
        }
        sc.close();
    }

    private static String stringToMorse(String s, String[] words, String[] morse) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result += " / ";
            } else {
                for (int j = 0; j < words.length; j++) {
                    if (String.valueOf(c).equals(words[j])) {
                        result += morse[j] + " ";
                    }
                }
            }
        }
        return result;
    }

    private static String morseToString(String s, String[] words, String[] morse) {
        String result = "";
        String[] morseCodes = s.split(" ");
        for (String code : morseCodes) {
            if (code.equals("/")) {
                result += " ";
            } else {
                for (int j = 0; j < morse.length; j++) {
                    if (code.equals(morse[j])) {
                        result += words[j];
                    }
                }
            }
        }
        return result;
    }
}