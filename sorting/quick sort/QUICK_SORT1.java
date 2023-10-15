import java.util.Arrays;

public class QUICK_SORT1 {

    public static void main(String[] args) {
        
        int [] arr={5,2,9,1,0,8,3,7,4,6};

        System.out.println(Arrays.toString(arr));

        quick_sort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));


    }
    
    public static void quick_sort(int[]arr,int low,int high){

        int pivot=partition(arr, low, high);

        if(low<high){
            

            quick_sort(arr, pivot+1, high);
             quick_sort(arr, low, pivot-1);
        }

    }


    public static int partition(int[]arr,int low,int high){


        int i=low;
        int j=high;
        int pivot=arr[low];


        while(i<j){

            while(arr[i]<=pivot){

                i++;
            }

            while(arr[j]>pivot){

                j--;
            }

            if(i<j){

                swap(arr,i,j);
            }

        }

        swap(arr, low, j);


        return j;
    }

    public static void swap(int[]arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
