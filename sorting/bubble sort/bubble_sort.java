class bubble_sort{

public static void main(String[] args) {
    
//int [] arr={8,2,5,9,-5,0,6};
int[] arr={2,9,1,-6,20};

  


Bubble_sort(arr);
/* 
System.out.println("after sorting");
     for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
   }*/


}

static void Bubble_sort(int[] arr){

 
   
    for (int i = 0; i < arr.length; i++) {
        boolean swapped=false;
        
        for (int j = 1; j < arr.length-i; j++) {


            if(arr[j]<arr[j-1]){

            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            
             swapped=true;
            }
           
            
        }

        
            if(swapped==false){
                break;
            }
        
    }
    System.out.println("after sorting");
     for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
   }
 
   


}}

