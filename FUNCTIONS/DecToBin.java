public class DecToBin {
    public static void DecToBin(int dec){
        int pow = 0;
        int binNum = 0;

        while(dec > 0){
            int rem = dec % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow ++;
            dec = dec/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args){
        DecToBin(7);
    }
}
