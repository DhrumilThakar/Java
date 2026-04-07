public class armstrongNumber {

    public static boolean isArmStrongNumber(int number){
        int og = number;
        int testNumber = number;
        int count=0;
        double result =0;
        while(number!=0){
            int digit = number%10;
            count++;
            number = number/10;

        }
        while(testNumber!=0){
            int digit = testNumber%10;
            testNumber = testNumber/10;

            result = result+Math.pow(digit, count);
        }
        if(((int)result)==og){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(12));
    }
}
