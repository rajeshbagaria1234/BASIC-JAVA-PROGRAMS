import java.util.*;
class array_list2{

    public static void main (String [] args){

        ArrayList<Integer>al=new ArrayList<Integer>();
        
        al.add(5);
        al.add(9);
        al.add(15);
       // al.get(1); this not print value storing in another variable is immportant
        int element= al.get(2);
   System.out.println(element);

    }
}