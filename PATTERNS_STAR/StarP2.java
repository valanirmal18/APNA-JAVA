
public class StarP2 {
    public static void main(String[] args){
        for(int i = 4; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// OR
/*
 * for (int i=0; i < n; i++) {
 * for (int j=0; j < n - i - 1; j++){
 * System.out.print("*");  
 * }
 * System.out.println();
 * }
 * 
 */