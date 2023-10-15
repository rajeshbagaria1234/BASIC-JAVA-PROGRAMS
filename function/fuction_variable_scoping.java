public class fuction_variable_scoping {
    
    public static void main(String[] args) {
      
        int v=99;

        System.out.println(v);
        
{
    int v=44;
System.out.println(v);

}
        System.out.println(v);
    }

}
