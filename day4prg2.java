public class day4prg2 {
    public static void main(String[] args) {
        int a=12;
        int b=50;
        int sum=0;
        for(int i=a;i<=b;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
