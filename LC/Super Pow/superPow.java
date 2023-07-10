import java.math.BigInteger;
class Solution {
    public int superPow(int a, int[] b) {
        String bStr = "";
        for(int digit : b){
            bStr+=digit;
        }
        BigInteger A = new BigInteger(""+a);
        BigInteger B = new BigInteger(bStr);
        BigInteger modulas = new BigInteger("1337");

        BigInteger result = A.modPow(B, modulas);
        return result.intValue();
    }
}
