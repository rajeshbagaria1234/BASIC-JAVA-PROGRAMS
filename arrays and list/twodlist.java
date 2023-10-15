import java.util.*;
import java.util.concurrent.ForkJoinPool;
public class twodlist {
    

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> al=new  ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < 2; i++) {
            
        

       al.add(new ArrayList<>());
        }
       for (int i = 0; i < 2; i++) {
        
        for (int j = 0; j < 2; j++) {
            
        
        al.get(i).add(sc.nextInt());
        
       }}
   
   System.out.println(al);
   
    }
}
