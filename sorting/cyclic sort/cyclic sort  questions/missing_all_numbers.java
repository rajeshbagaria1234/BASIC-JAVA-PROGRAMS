public class missing_all_numbers {
    

    public static void main(String[] args) {

        
    int[]arr={0,1,3,5,6,7};
    
    sorting(arr);
    
   
        
    }
    
static void  sorting(int[]arr){

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
    

missing(arr); 

}


static void missing(int[]arr){

    int ans=-1;

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=i){
            ans=i;
            System.out.println(ans);
        }
        

    }

    if(ans==-1){
        ans=arr.length;
        System.out.println(ans);
    }


}

}
