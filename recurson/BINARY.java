// connect A and M phone with each others hotspot network

public class BINARY {

    public static void main(String[] args) {

        int [] arr={2,4,5,8,9,13,55};

        int ans=BINARY_SEARCH(arr, 0, arr.length-1, 13);
        System.out.println(ans);
        
    }
    
    static int BINARY_SEARCH(int []arr,int start,int last,int target){
     
        
       
        
        if(start<=last){
        int mid=start+(last-start)/2;

            if(arr[mid]==target){
            
                
                return mid;
            }


            else if(arr[mid]<target){

               
                
                return BINARY_SEARCH(arr, mid+1, last, target);



            }

            else {

              
              
                return BINARY_SEARCH(arr, start, mid-1, target);
            }


        }
        return -1;
    }
}


