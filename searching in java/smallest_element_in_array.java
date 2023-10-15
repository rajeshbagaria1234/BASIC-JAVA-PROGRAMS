public class smallest_element_in_array {

public static void main(String[] args) {
    
int [] arr={2,55,55,5,1,0};
 fun(arr);


}

static void fun(int [] arr){

    int smallest=arr[0];

    for(int i=0;i<arr.length;i++){

   if(arr[i]<smallest){

    smallest=arr[i];
   }


    }

    System.out.println("the smallest element in array is : "+ smallest);

}
    
}
