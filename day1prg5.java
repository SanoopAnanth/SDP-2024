import java.util.Arrays;

public class day1prg5 {
    public static void main(String[] args) {
        int a[]={6,8,4,5,2,3};
        Arrays.sort(a); //inbuilt method to sort an array
        int []ar=findMinnumber(a);
        System.out.println("Num1 "+ar[0]+" Num2 "+ar[1]+" Num1+Num2 "+(ar[0]+ar[1]));
    }
    static int[] findMinnumber(int []ar){
        int num1=0,num2=0;
        for(int i=0;i<ar.length;i++){
            if(i%2==0)
                num1=num1*10+ar[i];
            else
                num2=num2*10+ar[i];
        }
        return new int[] {num1,num2};
    }
}
