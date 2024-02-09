public class MaxSubarraySumPrefix {
    public static void MaxSubarraySum1(int number[]) {
        int largestNum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // * calculate prefix ARRAY
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for (int k = i; k <= j; k++) {
                // currentSum += number[k];
                // }
                // System.out.println(currentSum);
                if (largestNum < currentSum) {
                    largestNum = currentSum;
                }
            }
            // System.out.println("--------------------------------");
        }
        System.out.println("MAX SUM : " + largestNum);
    }

    public static void main(String args[]) {
        int number[] = { 1, -2, 5, -6, 8, 7, -8 };
        MaxSubarraySum1(number);
    }
}
