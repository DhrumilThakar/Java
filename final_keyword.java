import java.util.*;

 public class final_keyword {
    final float PI= 3.14F;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI*r*r;
        System.out.println(area);
        sc.close();
    }
}