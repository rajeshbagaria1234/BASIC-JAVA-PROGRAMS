class cyclic{

    public static void main(String[] args) {
        int[] arr={3,2,5,1,4,7,6};

        cyclic_sort(arr);

        System.out.println("array after sort ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
    

    static void cyclic_sort(int[]arr){
        int i=0;
        

        while(i<arr.length){

           // int correct=arr[i]-1;
            if(i!=arr[i]-1){
               
            int temp=arr[i];
            arr[i]=arr[temp-1];
            arr[temp-1]=temp;
            }

            else{
                i++;
               
            }
        }


    }
}