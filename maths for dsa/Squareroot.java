public class Squareroot {

    public static void main(String[] args) {
        int n=3;
        double ans=square2( n,1,n);
        System.out.println( ans);
    }

    public static double square2(int n ,double i,double j)
    {
       double start=i;
       double last=j;
       double mid=(last+start)/2;


        double sqr=mid*mid;


        if(sqr==n ||Math.abs(sqr-n)<0.0000001){
                return mid;

            } else if (sqr<n)  {

                start=mid+1;
                return square2 (n,start,last);
            }

            else {
                last=mid-1;
                return square2 (n,start,last);
            }

        }
    }