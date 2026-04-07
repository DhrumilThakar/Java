//Given two integers N1 and N2, find their greatest common divisor.

public class gcd {

    public static int findGCD(int num1,int num2){
        while(num2!=0){
            int temp =num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        System.out.println(findGCD(4, 6));
    }
    
}
