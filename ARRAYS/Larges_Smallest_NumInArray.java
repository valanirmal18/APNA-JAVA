public class Larges_Smallest_NumInArray {
    public static int Max_num(int num[]){
        int largestNum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if(largestNum < num[i]){
                largestNum = num[i];
            } 
        }
        return largestNum;
    }
    
    public static int Min_num(int num[]){
        int SmallestNum = Integer.MAX_VALUE;
        for(int i = 0; i<num.length; i++){
            if(SmallestNum > num[i]){
                SmallestNum = num[i];
            } 
        }
        return SmallestNum;
    }

    public static void main(String args[]){
        int num[] = {3,4,2,9,13,12,6};
        System.out.println("MAx NUM :" +Max_num(num));
        System.out.println("MIn NUM :" +Min_num(num));

    }
}
