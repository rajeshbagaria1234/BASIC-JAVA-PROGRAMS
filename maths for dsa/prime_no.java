public class prime_no {

    public static void main(String [] args){

        int n=11;

        if(n<2){


            System.out.println(n +" is not a prime number");
        }

        else {
            int ans = prime(n);


            if (ans == 0) {

                System.out.print(n + " is a prime number");
            } else {

                System.out.print(n + " is not a prime number");
            }
        }

    }

    public static  int prime(int n){

        for (int i = 2; i < n; i++) {

            int p=n%i;
            if(p==0){
               return 1;

            }

        }


        return 0;
    }
}
