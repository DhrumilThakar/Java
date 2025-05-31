import java.util.Calendar;
import java.util.Scanner;

public class CalendarApp {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysOfMonth(int month, int year) {
        int[] days = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }

    public static void displayCalendar(int month, int year) {
        int daysOfMonth = getDaysOfMonth(month, year);
        System.out.println("\n=================");
        System.out.printf("\t %d/%d \n", month, year);
        System.out.println("==================");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, 2);
        int startingDay = c.get(Calendar.DAY_OF_WEEK);
        startingDay = (startingDay + 5) % 7;
        for (int i = 0; i < startingDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysOfMonth; day++) {
            System.out.printf("%4d", day);
            startingDay++;
            if (startingDay % 7 == 0 || day == daysOfMonth) 
            {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        System.out.print("Enter the month: ");
        int month = s.nextInt();
        if (month < 1 || month > 12) 
        {
            System.out.println("Invalid month");
        } else if (year < 0) 
        {
            System.out.println("Invalid year");
        } else 
        {
            displayCalendar(month, year);
        }
        s.close();
    }
}
