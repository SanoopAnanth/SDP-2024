import java.util.Scanner;

public class day2prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char ch[]=st.toCharArray();
        for(int i=1;i<ch.length-1;i++){
            if(ch[i]== 'A'){
                ch[i+1]=(char)((int)ch[i-1] & (int)ch[i+1]);
            }
            else if(ch[i]=='O'){
                ch[i+1]=(char)((int)ch[i-1] | (int)ch[i+1]);
            }
            else if(ch[i]=='C'){
                ch[i+1]=(char)((int)ch[i-1] ^ (int)ch[i+1]);
            }
        }
        int n=ch.length;
        System.out.println(ch[n-1]);
        sc.close();
    }
}
