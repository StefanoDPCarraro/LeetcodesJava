class Solution {
    /**
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     * 
     * Constraints:
     * -100.0 < x < 100.0
     * -231 <= n <= 231-1
     * n is an integer.
     * Either x is not zero or n > 0.
     * -10^4 <= x^n <= 10^4
     * 
     */
    public double myPow(double x, int n) {
        if(x == 1){
            return 1;
        }
        if(x == -1){
            if(n%2 == 0){
                return 1;
            }
            return -1;
        }
        if(n == 0){
            return 1;
        }
        if(n > 2147483647 || n < -2147483647){
            return 0;
        }
        double result = 1;
        if(n > 0){
            for(int i = 0; i < n; i++){
                result *= x;
            }
            return result;
        }
        for(int i = 0; i > n; i--){
            result /= x;
        }
        return result;
    }
}