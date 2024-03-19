import java.util.Scanner;

public class day2prg4 {
    public static void returnCount(int []House,int no_rat,int unitFood){
        int sum=0;
        int count=0;
        for(int i=0;i<House.length;i++){
            if(sum>=(no_rat*unitFood)){
                System.out.println("House required "+count);
                return;
            }
            sum+=House[i];
            count+=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_rat=sc.nextInt();
        int unitFood=sc.nextInt();
        int noHouse=sc.nextInt();
        int []house=new int[noHouse];
        for(int i=0;i<noHouse;i++){
            house[i]=sc.nextInt();
        }
        returnCount(house, no_rat, unitFood);
        sc.close();
    }
}
