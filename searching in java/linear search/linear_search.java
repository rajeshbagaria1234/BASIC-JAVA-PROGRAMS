import java.util.Scanner;

public class linear_search{

public static void main(String[] args) {
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    a=sc.nextInt();

int [] arr=new int [a];

System.out.println("enter the values in array");
for(int i=0;i<a;i++){

    arr[i]=sc.nextInt();
}


System.out.println("enter the key ");

int key;
key=sc.nextInt();

int y=linear_search1(arr,key,a);
System.out.println(y);

}

static int linear_search1(int arr[],int key,int a){

if(a==0){

    return -1;
}

for(int i=0;i<arr.length;i++){

if(arr[i]==key){
    return 1;
}



}
return -1;


}

}