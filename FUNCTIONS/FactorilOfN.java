public class FactorilOfN {
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int fact = fact(5);
        System.out.println("FACT OF N: " + fact);
        }
}
