import java.util.Arrays;

public class duplicate_number {
    public static void main(String[] args) {


        int[]arr={0,2,3,4,5,1};
    
    int ans =sorting(arr);
    System.out.println(ans);

    
        
    }
    
    static int  sorting(int[]arr){

        int i=0;
    while(  i<arr.length){
    
        if( arr[i] < arr.length &&arr[i] != i){
    
            int count=arr[i];
            if(arr[count]!=count){

                 int temp=arr[i];
            arr[i]=arr[temp];
            arr[temp]=temp;

            }

            else{
                return arr[i];
            }

           
        }
        else{
            i++;
        }
    
    
    }
        
    
    
    return -1;
    }



}
