import java.util.ArrayList;

public class divisor {

    public static String divisors(int number){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =1;i<=number;i++){
            if(number%i==0){
                list.add(i);
            }
        }
        return list.toString();
    }
    public static void main(String[] args) {
        System.out.println(divisors(6));
    }
}