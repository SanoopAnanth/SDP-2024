// import java.util.*;
// class day1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int flag=0;
//         System.out.print("Enter the number: ");
//         int a=sc.nextInt();
//         if(a>2){
//             for(int i=2;i<a/2;i++){
//                 if(a%i==0){
//                     System.out.println("Number is not prime");
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println("Number is not prime");
//             }
//         }
//     }
// }
import java.util.*;
class day1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count=0;
        int a=sc.nextInt();
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count>=2){
            System.out.println("Number is not a prime");
        }
        else{
            System.out.println("Number is prime");
        }
        sc.close();
    }
}