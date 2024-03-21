import java.util.*;
public class day4prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total vehicles: ");
        int v=sc.nextInt();
        System.out.println("Enter the number of wheels: ");
        int w=sc.nextInt();
        if(2>w || w%2!=0 || v>w){
            System.out.println("INVALID INPUT");
        }
        else
        {
            int tw=(v*4-w)/2;
            int fw=v-tw;
            System.out.println("TW:"+tw);
            System.out.println("FW:"+fw);
        }

    }
}
