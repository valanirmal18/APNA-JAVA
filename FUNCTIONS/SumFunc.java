import java.util.*;
public class SumFunc {
    public static int sum(int a, int b){ // Parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b); // arguments or actual parameters
        // System.out.println(sum(a, b));
        System.out.println(sum);
    }
}
