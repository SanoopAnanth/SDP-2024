import java.util.Scanner;

public class day2prg9 {
    public String dectoNbase(int n,int num){
        StringBuilder result=new StringBuilder();
        int q=num/n;
        int[] rem=new int[1];
        rem[0]=num%n;
        int resize=1;
        while(q!=0){
            resize++;
            int []temp=new int[resize];
            System.arraycopy(rem, 0, temp, 0, rem.length);
            rem=temp;
            rem[resize-1]=q%n;
            q=q/n;
        }
        for(int i=rem.length-1;i>=0;i--){
            if(rem[i]>9){
                result.append((char)(rem[i]+55));
            }
            else{
                result.append((char)(rem[i]+'0'));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        day2prg9 obj=new day2prg9();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        System.out.println("enter the num value");
        int num=sc.nextInt();
        String result=obj.dectoNbase(n, num);
        System.out.println(result);
        sc.close();
    }
}
