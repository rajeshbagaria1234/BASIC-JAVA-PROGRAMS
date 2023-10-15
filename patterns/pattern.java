class pattern{

    public static void main(String[] args) {

       
        

pattern1(4);
System.out.println();
System.out.println();
pattern2(4);

System.out.println();
System.out.println();
pattern3(4);

System.out.println();
System.out.println();
pattern4(5);
    }

    static void pattern1(int n){

        for (int row = 0; row <= n; row++) {
            for (int j = 0; j <= n; j++) {

                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }
    }


    static void pattern2(int n){

        for (int row = 0; row <= n; row++) {
            for (int j = 0; j <= row; j++) {

                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }
    }

    static void pattern3(int n){

        for (int row = 0; row <= n; row++) {
            for (int j = 0; j <=n-row ; j++) {

                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }
    }

    static void pattern4(int n){

        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <=row ; j++) {

                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }

    
    static void pattern5(int n){

        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <=row ; j++) {

                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
}