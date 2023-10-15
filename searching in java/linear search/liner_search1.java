public class liner_search1 {
    
    public static void main(String[] args) {
        
    
    String s="rajesh";
    
    char key='n';
    System.out.println(search( s,key));

    }

    static boolean search(String s,char key){

        if(s.length()==0){

            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==key){

                return true;
            }
            
        }
        return false;

    }

}
