import javax.print.attribute.IntegerSyntax;

class one{
public static void main(String[] args) {
    
    String a="rajesh";
    //String b="rajesh";           note :- it gives true because a and b pointing to same object


    String b=new String("rajesh");
    
    System.out.println(a==b);


Integer  num=new Integer(56);
    System.out.println(num.toString());
}
}