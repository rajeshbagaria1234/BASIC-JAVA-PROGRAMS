import java.util.Arrays;

class reverse_array{

    public static void main(String[] args) {
        

        int []arr={1,2,3,4,5,6};
        int peack=arr.length;
        

        System.out.println("array before reverse");
        System.out.println(Arrays.toString(arr));
        STACK(arr,peack);



    }

    static void STACK(int[] arr,int peack){

        int top=0;
        int i=0;
        int j=0;
        
       int []stack=new int [peack];

       while(top<peack){
    
        stack[top]=arr[i];
        top++;
        i++;

       }

      top=top-1;

       while(top>=0){
    
       arr[j]= stack[top];
        top--;
        j++;

       }

       System.out.println("after reverse");


System.out.println(Arrays.toString(arr));
       
    
}

}