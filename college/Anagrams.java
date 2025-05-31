import java.util.*;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter real string :");
        String str = s.next();
        System.out.print("Enter the anagram string : ");
        String str2 = s.next();
        if (str.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            int count = 1;
            boolean check = false;
            char[] str1 = str.toCharArray();
            char[] str3 = str2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str3);
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1[i] == str3[j]) {
                        check = true;
                    }
                }
                if (check == true) {
                    count++;
                }
                check = false;

            }
            if (count == str.length()) {
                System.out.println(" Anagram");
            } else {
                System.out.println(" not Anagram");
            }
        }
        s.close();
    }
}