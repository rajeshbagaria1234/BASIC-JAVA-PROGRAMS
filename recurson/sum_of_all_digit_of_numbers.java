public class sum_of_all_digit_of_numbers {
    public static void main(String[] args) {

        int ans=num(12);
        System.out.println(ans);
    }

    public static int num(int n){
        int rem=n%10;
        n=n/10;
if(n<0){
    return 0;
}
        return rem+num(n);
    }

}
