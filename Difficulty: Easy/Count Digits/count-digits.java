class Solution {
    public static int evenlyDivides(int N) {
        int original = N;
        int count = 0;

        while (N > 0) {
            int digit = N % 10;  // extract last digit
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            N /= 10; // remove last digit
        }
        
        return count;
    }
}