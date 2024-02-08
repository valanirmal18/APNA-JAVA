public class PrimeNumPrint {
    public static int isPrimeNum(int n){
        int flag = 0;
        for(int i = 2; i < n-1/* or i < Maht.sqrt(n) */; i++){
            if(n%i == 0){
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        return flag;
    }
    public static void prime_num(int n){
        for(int i = 2; i <= n; i++){
            if(isPrimeNum(i) == 0){
                System.out.println(i);
            } 
        }
    }
    public static void main(String[] args){
    prime_num(100);
    }
}
