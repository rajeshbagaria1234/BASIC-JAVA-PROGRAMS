public class n_to_1_numbeer {

    public static void main(String[] args) {
        fun1(5);
        fun2(5);

    }
    static void fun1(int n){

        if(n==0){
        return;
        }

        System.out.println(n);// printing before  the removing the data from stack memory
        fun1(n-1);

    }

    static void fun2(int n){

        if(n==0){
            return;
        }


        fun2(n-1);
        System.out.println(n);// printing when   the stack memory start to delete the data from stack memory

    }
}
