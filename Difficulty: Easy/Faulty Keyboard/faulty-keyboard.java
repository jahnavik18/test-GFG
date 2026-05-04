// User function Template for Java

class Solution {
    static int maxNatural(int m) {
        // code here
         long M=m;
        long digitLength=1;
        long countInRange=9;
        long startRange=1;
        long result=0;
        while(M>=digitLength*countInRange)
        {
            M-=digitLength*countInRange;
            result+=countInRange;
            
            digitLength++;
            startRange*=10;
            countInRange=9*startRange;
        }
        result+=(M/digitLength);
        return (int) result;
    }
}