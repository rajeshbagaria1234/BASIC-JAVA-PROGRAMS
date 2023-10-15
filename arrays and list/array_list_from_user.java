import java.util.*;
 class array_list_from_user{

public static void main(String[] args){


    ArrayList<Integer> list=new ArrayList<Integer>(5);
    
    Scanner sc=new Scanner(System.in);


    System.out.println("please enter the values in list");

    for(int i=0;i<5;i++){

        list.add(sc.nextInt());
    }
int p=4;
System.out.println(list.get(p));//it can not work in array list

    
    System.out.println(list);
    System.out.println("function");
    list.get(2);
}

 }

