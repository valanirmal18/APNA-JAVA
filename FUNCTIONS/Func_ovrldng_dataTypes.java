public class Func_ovrldng_dataTypes {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(1, 4));
        System.out.println(sum(1.5f, 4.5f));
    }
}
