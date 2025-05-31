public class varargs 
{
     static int sum(int...arr)
    {
        int result = 0;
        for(int i : arr)
        {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        //we use vararg when there is a situation in which the variable of a method goes on increasing
        //so, varargs convert all those variable in the form of an array
        // syntax for vararg is static data_type methode_name(data_type ...arr)
        /*{
            code to implement
        }*/
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,7));
        System.out.println(sum(4,5));
        System.out.println(sum(4));
        System.out.println(sum());
        // if we write static data_type methode_name(data_type variable_name,data_type ...arr)
        //the we must take one argument in the method it can't be null
     
    }    
}
