public class swap{
    public static void main(String[] args){
        int c= 10;
        int d=20;
        swap(c,d);
        System.err.println(c+" "+d);
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b=temp;
    }
}