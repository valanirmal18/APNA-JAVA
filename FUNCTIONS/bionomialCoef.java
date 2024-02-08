public class bionomialCoef {
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static int bionomialCoefficients(int n,int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int Bio_coe = (n_fact) / (r_fact * nmr_fact);
        return Bio_coe;
    }
    public static void main(String[] args){
        // * Bionomial Coe = n! / r! * (n-r)!
        int n = 5;
        int r = 2;
        int Bio_coe = bionomialCoefficients(n, r);
        System.out.println("Bio_Coefficient : " + Bio_coe);
        }
}
