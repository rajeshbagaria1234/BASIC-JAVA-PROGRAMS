import java.util.Scanner;

class binary1{


    public static void main(String[] args) {
        
 int [] arr={10,15,20,55,58,66,80,99};

 Scanner sc=new Scanner(System.in);
 System.out.println("enter the target from array");
 int target=sc.nextInt();

int ans=binary_search(arr, target);
System.out.println(ans);
    }

    static int binary_search(int [] arr,int target){

    int start=0;
    int end=arr.length-1;

 while(start<=end){
     
    int mid=start+(end-start)/2;

    if(arr[mid]==target){
        return mid;
    }
    else if(target > arr[mid]){
        start=mid+1;
    }

    else {
        end=mid-1;
    }
mid=start+(end-start)/2;
    
} return -1;

}

    
}