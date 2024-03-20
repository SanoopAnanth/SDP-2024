import java.util.Scanner;

public class day3prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the difference: ");
        int diff=sc.nextInt();
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if((a[i]-num)<=diff){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
