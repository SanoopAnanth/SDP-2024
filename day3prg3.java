import java.util.Scanner;

public class day3prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String text=sc.nextLine();
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        while(key<0){
            System.out.println("enter only positive key");
            key=sc.nextInt();
        }
        System.out.println(CipherCaser(key,text));
        sc.close();
    }
    static String CipherCaser(int key, String text){
        char [] ch=text.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i] )|| (Character.isDigit(ch[i]))){
                ch[i]=(char)((int)ch[i]+key);
            }
            else{
                if(Character.isWhitespace(ch[i])){
                    ch[i]=ch[i];
                }
            }
        }
        return "The encrypted text is:"+new String(ch);
    }
}
