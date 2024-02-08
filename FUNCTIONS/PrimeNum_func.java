public class PrimeNum_func {
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
    public static void main(String[] args){
        int flag = isPrimeNum(15);

        if(flag  == 1) {
            System.out.println("NON PRIME NUM");
        } else {
            System.out.println("PRIME NUM");
        }
    }
}

