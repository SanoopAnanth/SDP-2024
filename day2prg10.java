import java.util.*;
public class day2prg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
