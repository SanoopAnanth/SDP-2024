import java.util.Scanner;

public class day3prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []ar=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int max=ar[1];
        int count=0;
        for(int i=1;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
