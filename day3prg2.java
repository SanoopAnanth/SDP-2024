public class day3prg2 {
    public static void main(String[] args) {
        
    int []ar={2,4,2,4,6,8};
    for(int i=0;i<ar.length;i++){
        int ele=ar[i];
        int j=i+1;
        while(j<ar.length){
            if(ar[j]>ele){
                ar[i]=ar[j];
                break;
            }
            j++;
        }
    }
}
}
