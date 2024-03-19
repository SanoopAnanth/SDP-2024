import java.util.*;
public class day2prg8 {
    public String ReplaceCharacter(char str[],int n, char ch1,char ch2){
        for(int i=0;i<n;i++){
            if(str[i]==ch1){
                str[i]=ch2;
            }
            else if(str[i]==ch2){
                str[i]=ch1;
            }
        }
        return new String(str);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char[] ch=st.toCharArray();
        char a1=sc.next().charAt(0);
        char a2=sc.next().charAt(0);
        day2prg8 obj=new day2prg8();
        String result=obj.ReplaceCharacter(ch, ch.length, a1, a2);
        System.out.println(result);
        sc.close();
    }
}
