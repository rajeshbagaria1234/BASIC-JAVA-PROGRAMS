import java.util.ArrayList;

public class lists{

    public static void main(String[] args){

        ArrayList<Integer>al=new ArrayList<Integer>(10);

        al.add(1);
        al.add(5);
        al.add(7);
        al.add(99);
        al.add(50);
        al.add(77);
        
        System.out.println(al);//pring the array list

        al.set(0, 55);//updating the index
        System.out.println(al);//printing arraytlist after aditing
        al.remove(3);
        System.out.println(al);//printing arraytlist after aditing

    }
}