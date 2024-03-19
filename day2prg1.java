import java.util.Scanner;

public class day2prg1 {
    public int retTime(int weight){
        int time=0;
       if(weight>0 && weight<=2000){
        time=25;
       }
       else if(weight>2000 && weight<=4000){
        time=35;
       }
       else if(weight>4000 && weight<=7000){
        time=45;
       }
       return time;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the weight.....");
        int weight=sc.nextInt();
        day2prg1 obj=new day2prg1();
        if(weight>0 && weight<=7000){
            int result=obj.retTime(weight);
            System.out.println(result);
        }
        else{
            if(weight>7000)
                System.out.println("OVERLOAD");
            else
                System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
