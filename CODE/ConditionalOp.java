package CODE;
public class ConditionalOp {
    public static void main(String[] args){
        int marks = 34;
        if(marks>35 && marks<100){
            System.out.println("You are pass");
        } else if(marks<35 && marks>0) {
            System.out.println("You are Fail");
        } else {
            System.out.println("Enter Valid Number");
        }
    }
}
