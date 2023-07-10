package PowMath;

import java.math.BigInteger;
class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1){
            return 1;
        }
        if(n==1 || x==-1){
            if(x == -1){
                if(n % 2 != 0){
                    return x;
                }
                return -1 * x;
            }
            return x;
        }
        double result = 1;
        int exponent =n>0?n:(n*-1);
        double max_size = 2147483647;
        if(exponent > max_size || exponent < -1 * max_size){
            return 0;
        }
        int i=0;            
        while(i< exponent){
            result*= x;
            i++;
            if(i >= exponent){
                break;
            }
            result*= x;
            i++;
                
        }
        if(n < 0){
            result = 1 / result;
        }
        
        return result;
        
    }
}
