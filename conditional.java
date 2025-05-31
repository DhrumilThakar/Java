import java.util.*;

public class conditional {
    /*
     * public static void main(String[] args)
     * {
     * Scanner s = new Scanner(System.in);
     * System.out.println("Enter the number of subject :");
     * int n = s.nextInt();
     * int [] marks;
     * marks = new int [n];
     * for(int i=0;i<n;i++)
     * {
     * System.out.println("Enter marks in subject "+(i+1));
     * marks[i] = s.nextInt();
     * }
     * int total=0;
     * for(int i=0;i<n;i++)
     * {
     * total = total + marks[i];
     * }
     * int result = total/n;
     * if(result>40 && marks[1]>30 && marks[2]>33 && marks[3]>33)
     * {
     * System.out.println("Pass");
     * }
     * else
     * {
     * System.out.println("Fail");
     * }
     * s.close();
     * }
     */
    public static void main(String[] args) {
        /*
         * Scanner s = new Scanner(System.in);
         * System.out.println("Enter your income in lakhs : ");
         * float income = s.nextFloat();
         * if(income>=2.5 && income<=5.0)
         * {
         * System.out.println("You pay 5% tax which is : "+((5/100)*income));
         * }
         * else if(income>=5.0 && income<=10.0)
         * {
         * System.out.println("You pay 20% tax which is : "+(0.2*income));
         * }
         * else if(income>10.0)
         * {
         * System.out.println("You pay 30% tax which is : "+((30/100)*income));
         * }
         * else
         * {
         * System.out.println("You have very less income work hard");
         * }
         * s.close();
         * }
         */
        /*
         * Scanner s= new Scanner(System.in);
         * System.out.println("Enter the no of day : ");
         * int day = s.nextInt();
         * switch (day)
         * {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * case 3:
         * System.out.println("wensday");
         * break;
         * case 4:
         * System.out.println("Thusday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Satruday");
         * break;
         * case 7:
         * System.out.println("Sunday funday");
         * break;
         * 
         * default:
         * break;
         * }
         * s.close();
         * }
         */
        /*
         * Scanner s= new Scanner(System.in);
         * System.out.println("Enter the year : ");
         * int year = s.nextInt();
         * if(year%4==0)
         * {
         * System.out.println("Enter year is a leap year !");
         * }
         * else
         * {
         * System.out.println("Not a lip year");
         * }
         * s.close();
         * }
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a url ");
        String url = s.next();

        if (url.equals("com"))
            System.out.println("Commerical");
        if (url.equals("org"))
            System.out.println("Organization");
        if (url.equals("in"))
            System.out.println("Indian");
        s.close();
    }
}
