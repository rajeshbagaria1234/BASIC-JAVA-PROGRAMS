import java.util.Arrays;
import java.util.*;

public class array {
    
    public static void main(String[] args) {
 /*        

int arr[]={1,2,3,4,5,6};

for (int i = 0; i < arr.length; i++) {
    System.out.println(Arrays.toString(arr));
    
}
*/


int arr[][]=new int [2][2];

Scanner sc=new Scanner(System.in);
System.out.println("enter the values");
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        
        arr[i][j]=sc.nextInt();
    }
    
}


for (int i = 0; i < arr.length; i++) {
    
System.out.println(Arrays.toString(arr[i]));

}


String num="rajesh";
char[] num1={'h','e','l','l','o'};

System.out.println(Arrays.toString(num.toCharArray()));

System.out.println(Arrays.toString(num1));

    }
    
}
