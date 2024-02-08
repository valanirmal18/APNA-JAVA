import java.util.*;

public class ArrayIp {

    public static void main(String[] args){
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Entered NUm : ");
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
