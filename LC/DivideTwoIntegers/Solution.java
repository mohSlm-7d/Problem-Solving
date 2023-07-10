package DivideTwoIntegers;

import java.math.BigInteger;
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        BigInteger num1 = new BigInteger(""+dividend);
        BigInteger num2 = new BigInteger(""+divisor);
        BigInteger result = new BigInteger("0");
        
        if(!num2.equals(BigInteger.ZERO)){
            result = num1.divide(num2);
        }
        return result.intValue();
    }
}