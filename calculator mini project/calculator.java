import java.util.Scanner;
public class calculator {
    
public static void main(String [] args)
{

    System.out.println("please enter the operation that you want to be performed : ");
    char ch ;

    Scanner sc=new Scanner(System.in);
    
    ch=sc.next().charAt(0);

    System.out.println("enter the first number ");
    int first =sc.nextInt();
    System.out.println("enter the second number ");
    int second =sc.nextInt();
    int ans;

if(ch== '+'){

ans=first+second;

System.out.println("the answer is : "+ans);
System.out.println("thank you ");
System.out.println();

}

else if(ch== '-'){

    ans=first-second;
    System.out.println("the answer is : "+ans);
    System.out.println("thank you ");
    System.out.println();
}


else if(ch== '%'){

    ans=first % second;
    System.out.println("the answer is : "+ans);
    System.out.println("thank you ");
    System.out.println();
}


else if(ch== '/'){
if(second==0){
    System.out.println(" infinite ");
    System.out.println("thank you ");
    System.out.println();
}else{
    ans=first-second;
    System.out.println("the answer is : "+ans);
    System.out.println("thank you ");
    System.out.println();
}
}


else if(ch== '*'){

    ans=first*second;
    System.out.println("the answer is : "+ans);
    System.out.println("thank you ");
    System.out.println();
}
else {

    System.out.println("invalid input ");

    System.out.println("try next time");
    System.out.println("thank you ");
    System.out.println();
}


}
}
