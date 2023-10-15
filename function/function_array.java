public class function_array {
    
public static void main(String[] args) {
    int [] arr={1,2,3,4,5};

    fun(arr);
    for(int i=0;i<=5;i++){

        System.out.println(arr[i]);
    }
}


static void fun(int [] arr){

    arr[0]=5+4;
}

}
