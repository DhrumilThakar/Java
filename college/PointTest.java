import java.util.*;
class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = Math.max(0, Math.min(x, 100));
        this.y = Math.max(0, Math.min(y, 100));
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public void move(int dx, int dy) {
        x = Math.max(0, Math.min(x + dx, 100));
        y = Math.max(0, Math.min(y + dy, 100));
    }
}
public class PointTest {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first Coordinate : ");
        int f = s.nextInt();
        System.out.print("Enter the second Coordinate : ");
        int se = s.nextInt();
        Point p = new Point(f, se);
        System.out.println("Point is : " + p);
        p.move(f,se);
        System.out.println("Point is : " + p);
        s.close();
    }
}