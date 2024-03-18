import java.util.Scanner;

public class day1prg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0;
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i==0 && ch[0]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
                // System.out.println(ch[i]);
                f=i;
            }
            if(i==ch.length-1 || ch[i]!=' ' && ch[i+1]==' '){
                // System.out.println(ch[i]);
                char c=ch[i];
                ch[i]=ch[f];
                ch[f]=c;
            }
        }
        System.out.println(ch);
        sc.close();
    }
}
