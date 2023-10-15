import java.sql.SQLOutput;
import java.util.*;
class BubbleSort {

    public static int printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]= {3,2,1,8,9,4};

        for(int i=0; i<arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        printArray(arr);
    }
}
