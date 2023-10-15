import java.util.Arrays;

class quick_sort {

	
	public static void main(String[] args) {
		
		int []arr={4,1,5,7,0,2,9,6};

		quickSort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));
	}


public static void 	quickSort(int[]arr,int low ,int high){

	if(low<high){

		int pivot=partition(arr,low,high);

		quickSort(arr,pivot+1, high);
		quickSort(arr, low, pivot-1);

	}
}

public static int partition(int[] arr,int low ,int high){

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