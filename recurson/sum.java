public class sum {
    public static void main(String[] args) {

        int ans =Sum(5);
        System.out.println(ans);
    }
    public static int Sum(int n){
        if (n<1){
            return 0;
        }

        return n+Sum(n-1);
    }
}
