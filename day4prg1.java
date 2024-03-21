// import java.util.*;
class day4prg1{
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        int a=7;
        int b=12;
        day4prg1 obj=new day4prg1();
        int result=obj.maxComonents(a,b);
        System.out.println(result);
    }
    public int maxComonents(int a, int b){
        int max=0,num=0;
        for(int i=a;i<=b;i++){
            int temp=count(i);
            if(temp>max){
                max=temp;
                num=i;
            }
        }
        return num;
    }
    static int count(int a){
        int count=0;
        while(a%2==0 & a!=0){
            count++;
            a=a/2;
        }
        return count;
    }
}