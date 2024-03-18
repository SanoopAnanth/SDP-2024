import java.util.Scanner;

public class day1prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the string:  ");
        String s=sc.nextLine();
        System.out.println("Enter the character");
        char a=sc.next().charAt(0);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=a;
                }
            }
            if(count>0){
                ch[i]=a;
            }
        }
        System.out.println(ch);
        sc.close();
    }
}
