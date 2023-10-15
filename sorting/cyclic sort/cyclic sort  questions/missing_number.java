import java.util.Arrays;

class missing_number{
public static void main(String[] args) {

    int[]arr={0,1};
    
 int ans=sorting(arr);
 System.out.println(ans);

    
}

static int  sorting(int[]arr){

    int i=0;
while(  i<arr.length){

    if(arr[i] < arr.length && arr[i] != i){

        int temp=arr[i];
        arr[i]=arr[temp];
        arr[temp]=temp;
    }
    else{
        i++;
    }


}
    

return missing(arr);

}


static int missing(int[]arr){

    int ans=-1;

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=i){
            ans=i;
        }
        


    }

    if(ans==-1){
        ans=arr.length;
    }


    return ans;
}


}