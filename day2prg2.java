import java.util.Scanner;

public class day2prg2 {
    public static void main(String[] args) {
        int a[]=new int[9];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        double avg1=0,avg2=0,avg3=0;
        for(int i=0;i<a.length;i++){
            if(i==0||i==3||i==6){
                avg1+=a[i];
            }
            else if(i==1||i==4||i==7){
                avg2+=a[i];
            }
            else{
                avg3+=a[i];
            }
        }
        avg1=avg1/3;
        avg2=avg2/3;
        avg3=avg3/3;
        System.out.println(avg1);
        System.out.println(avg2);
        System.out.println(avg3);
        if(avg1<70 || avg2<70 || avg3<70){
            System.out.println("All Trainee are unfit");
        }
        if(avg1>=avg2 && avg1>=avg3){
            System.out.println("Traine number: 1");
        }
        if(avg2>=avg1 && avg2>=avg3){
            System.out.println("Trainee number: 2");
        }
        if(avg3>=avg1 && avg3>=avg2){
            System.out.println("Trainee number: 3");
        }
        sc.close();
        
    }
}
