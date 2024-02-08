import java.util.*;

public class ArrayIpOp {
    public static void main(String[] args){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("O/p : " + marks[0]);
        System.out.println("O/p : " + marks[1]);
        System.out.println("O/p : " + marks[2]);
        
        int per = (marks[1]+marks[2]+marks[0]) / 3;
        System.out.println("Perc : " + per);
        // marks[2] = 100;
        // System.out.println("Updated marks : " + marks[2]);

    }
}
