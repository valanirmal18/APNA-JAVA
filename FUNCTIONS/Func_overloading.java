public class Func_overloading {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 4;
        int sum = sum(a, b);
        System.out.println(sum);
        sum = sum(a, b, c);
        System.out.println(sum);
    }
}
