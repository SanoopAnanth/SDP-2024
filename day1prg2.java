public class day1prg2 {
    public static void main(String[] args) {
        String st="Banglore-is-Nice-city";
        char []a=st.toCharArray();
        String result="";
        for(int i=0;i<st.length();i++){
            if(a[i]=='-'){
                result+=a[i];
            }
            // System.out.println(a[i]);
        }
        for(int i=0;i<st.length();i++){
            if(a[i]!='-'){
                result+=a[i];
            }
        }
        System.out.println(result);
        day1prg2 obj=new day1prg2();
        obj.newClass();
    }
    public void newClass(){
        System.out.println("Printing.........");
    }
}
