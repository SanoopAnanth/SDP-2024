import java.util.Arrays;

public class leet4 {
    public static void main(String[] args) {
        int num1[]={};
        int num2[]={1,2,3,4,5};
        // System.out.println((2+3)/2);
        double result=findMedianSortedArrays(num1,num2);
        System.out.println(result);
    }
    static double findMedianSortedArrays(int []nums1,int []nums2){
        int m=nums1.length;
        double res;
        int n=nums2.length;
        int result[]=new int[m+n];
        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);
        Arrays.sort(result);
        if(result.length % 2==0){
            int pos=(m+n)/2 ;
            res=(result[pos-1]+result[pos])/2.0;
        }
        else{
            if(result.length==1){
                res=result[0];
            }else{
            int pos=(m+n/2);
            res=result[pos-1];
            }
        }
        return res;
    }
}
