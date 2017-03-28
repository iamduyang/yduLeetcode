/**
 * 507. Perfect Number
 */


public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 4) {
            return false;
        }
        int sum = 0;
        int i = 1;
        for (; i * i < num; i++) {
            if (num % i == 0) {
                sum += i;

                sum += num / i;


            }
        }
        int sqrtSum =(int)Math.sqrt(sum);
        if(sum==sqrtSum*sqrtSum)
            sum += sqrtSum;
        return sum - num == num;
    }
}