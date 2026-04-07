import java.util.ArrayList;

public class isPrimeNumber {

    public static boolean isPrime(int number){
        if (number <= 1) return false; // 0 and 1 are not prime
        if (number == 2) return true;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                list.add(i);
            }
        }
        if(list.size()>2){
            return false;
        }
        if(list.size()==2 && list.contains(1) &&list.contains(number)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }
    
}
