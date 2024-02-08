public class MaxSubarraySum {
    public static void MaxSubarraySum1(int number[]) {
        int largestNum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i; j < number.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += number[k];
                }
                System.out.println(currentSum);
                if (largestNum < currentSum) {
                    largestNum = currentSum;
                }
            }
            System.out.println("--------------------------------");
        }
        System.out.println("MAX SUM : " + largestNum);
    }

    public static void main(String args[]) {
        int number[] = { 1, -2, 5, -6, 8, 7, -8 };
        MaxSubarraySum1(number);
    }
}
