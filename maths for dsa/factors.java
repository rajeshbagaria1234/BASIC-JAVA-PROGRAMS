public class factors {

    public static void main(String[] args) {

        int n=20;


        factors1(n);


    }

    public  static  void factors1(int n){

        for (int i = 2; i*i<=n ; i++) {

            if(n%i==0){

                int p=n/i;

                System.out.println(i);
                System.out.println(p);
            }

        }
    }
}
