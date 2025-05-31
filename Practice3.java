import java.util.*;

/*public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.For entering Student Marks\n0.Exit");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter Student marks Between 100 and 0");
                int marks = sc.nextInt();
                do {
                    if (marks <= 100 && marks >= 90) {
                        System.out.println("This marks are good");
                    } else if (marks <= 89 && marks >= 60) {
                        System.out.println("This is also good");
                    } else if (marks >= 0 && marks <= 59) {
                        System.out.println("This is also well good");
                    } else if (marks < 0 && marks > 100) {
                        System.out.println("Enter valid marks");
                    }

                } while (a == 100);
                break;
            case 0:
                System.out.println("Exixting");
                break;
        }

        sc.close();
    }
}*/

// ****************************ANSWER 3********************************
public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Enter a nuumber");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        if (flag == 2) {
            System.out.println("Enter number is prime");
        } else {
            System.out.println("Enter number is not prime");
        }
        sc.close();
    }
}