import java.util.ArrayList;

public class array_list_example {
    

    public static void main(String[] args) {

       // Scanner sc=new Scanner(System.in);
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(11);
        al.add(12);
        al.add(13);

        System.out.println(al.contains(11));//int gives true
        System.out.println(al.contains(99));//it gives false
        al.set(0, 55);//it can update 0 index of list
        System.out.println(al);
       al.remove(4);//it remove element of index 4

       

        System.out.println(al);
System.out.println("by using for loop");

        for (int i :al) {
            System.out.print(i +" ");
            
        }
       for (int i = 0; i < args.length; i++) {
        
        System.out.println(al.get(i));
       }

       
    }
}
