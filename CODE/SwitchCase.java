package CODE;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("SAMOSA");
                break;
            case 2 : System.out.println("Burger");
                break;
            case 3 : System.out.println("Pizza");
                break;
            default : System.out.println("dream");
        }
    }   
}
