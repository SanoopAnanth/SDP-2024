import java.util.*;
public class day3prg1 {
    public static void main(String[] args) {
        int [] ar={0,9,3,5,1,2};
        Arrays.sort(ar);
        // System.out.println(Arrays.toString(ar));
        int sp=0,dp=0;
        dp=getSum(ar);
        int i=ar.length-1;
        while(sp<dp){
            dp=dp-ar[i];
            sp=sp+ar[i];
            i--;
        }
        System.out.println("Stephan power: "+sp);
        System.out.println("Daemon power: "+dp);
    }
    public static int getSum(int [] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }
}
