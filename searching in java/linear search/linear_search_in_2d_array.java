import java.util.Arrays;

public class linear_search_in_2d_array {

    public static void main(String[] args) {
        
int[][] arr={ {1,99,33},
           {36,20,11},
           {28,94,29}
};

    int target=11;
    int ans[] =search(arr, target);
    System.out.println(Arrays.toString(ans));

    

    }
    
    static int [] search(int [] [] arr,int target){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==target){
                    //return new int [] {i,j}; 
                    return new int [] {i,j};
                }
            }
        }

      //return new int [] {-1,-1};
     
      
    return new int [] {-1,-1};
    }
}
