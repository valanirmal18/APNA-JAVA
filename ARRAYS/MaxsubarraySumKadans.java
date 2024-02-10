public class MaxsubarraySumKadans {
        public static void kadanes(int number[]){
            int MAX_SUM = Integer.MIN_VALUE;
            int CS = 0;

            for(int i = 0; i < number.length; i++){
                CS = CS +number[i];
                if(CS < 0){
                    CS = 0;
                }
                // MAX_SUM = Math.max(CS, MAX_SUM);
                if(CS > MAX_SUM) { // Update MAX_SUM only if CS is greater than MAX_SUM
                    MAX_SUM = CS;
                }
            }
            System.out.println("MAX SUM = " + MAX_SUM);

        }
    
        public static void main(String args[]) {
            // int number[] = { 1, -2, 5, -6, 8, 7, -8 };
            int number[] = { -1, -2, -6, -8};
            // MaxSubarraySum1(number);
            kadanes(number);
        }
    }
