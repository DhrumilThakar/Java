//Given an integer x, return true if x is a palindrome, and false otherwise.

public class palindrom {

    public static boolean isPalindrom(int number){

        int og =number;
        int result=0;
        while(number!=0){
            int digit = number%10;
            number =number/10;

            result = result*10 +digit;
        }
        if(result==og){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(121));       
    }
    
}