class insertion_sort{

    public static void main(String[] args) {
        

    int[]arr={8,6,0,77,50,-4};
    insertfun(arr);

    

    }

    static void insertfun(int[]arr){

for (int i = 0; i < arr.length-1; i++) {

    for (int j =i+1; j > 0; j--) {

        if(arr[j]<arr[j-1]){

            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }
        else{
            break;
        }
        
    }
    
}System.out.println("array after sorting");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }



    }

}