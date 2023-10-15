public class Decimal {
    public static void main(String[] args) {
    int n = 17 ;
    int ans = ToBinary(n);
        System.out.println(ans);
    }
    public static int ToBinary(int n)
    {
        int no = n  ;
        int digit = 0 ;
        int rem ;
        while (no!=0)
        {
            rem = n%2 ;
            digit=digit*10 + rem ;
            n=n/2 ;
        }
        return digit ;
    }

}
