public class digit {

    public static int countDigit(int number){
        int count=0;
        while(number!=0){
            int digit = number%10;
            count++;
            number=number/10;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(countDigit(14));
        
    }
    
}
