package CODE;
public class ReverseNum1 {
    public static void main(String[] args){
        int num = 123456700, revNum = 0, rem;
        while (num > 0) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
        System.out.println(revNum);
    }
}
