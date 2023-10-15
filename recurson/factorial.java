public class factorial {
    public static void main(String[] args) {

        int ans=fact(6);
        System.out.println(ans);
    }

    public  static int fact(int n){

        if(n==1 || n==0||n<0){
return n;

    }
        return n*fact(n-1);
    }
}
