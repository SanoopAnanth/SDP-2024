//program for counting number of carries
import java.util.*;
public class day2prg7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int result=NumberOfCarries(num1,num2);
        System.out.println(result);
        sc.close();
    }
    public static int NumberOfCarries(int num1,int num2){
        int carry=0,count=0;
        while(num1>0 || num2>0){
            int d1=num1%10;
            int d2=num2%10;
            int sum=carry+d1+d2;
            carry=sum/10;
            if(carry>0){
                count++;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return count;
    }
}
