import java.util.Scanner;
import java.util.Arrays;

public class day2prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double interior[]=new double[n1];
        double exterior[]=new double[n2];
        for(int i=0;i<interior.length;i++){
            interior[i]=sc.nextDouble()*18;
        }
        for(int i=0;i<exterior.length;i++){
            exterior[i]=sc.nextDouble()*12;
        }
        double result=0;
        result=Arrays.stream(interior).sum();
        result+=Arrays.stream(exterior).sum();
        System.out.println(result+" INR");
        sc.close();
    }
}
