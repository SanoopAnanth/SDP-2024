import java.util.*;
public class day4prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int even[],odd[];
        int n=arr.length;
        if(arr.length%2==0){
            even=new int[n/2];
            odd=new int[n/2];
        }
        else{
            even=new int[(n/2)+1];
            odd=new int[n/2];
        }
        int ar1=0,ar2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even[ar1]=arr[i];
                ar1+=1;
            }
            else{
                odd[ar2]=arr[i];
                ar2+=1;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        System.out.println(even[even.length-2]+odd[odd.length-2]);
        sc.close();
    }
}
