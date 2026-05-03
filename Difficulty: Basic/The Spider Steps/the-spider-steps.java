// User function Template for Java

class Solution {
    static int minStep(int H, int U, int D) {
        // code here
         if (U > H) {
            return 1;
         }
        
        int netClimb = U - D;
        int stepsBeforeLast = (H - U) / netClimb; 
        
        return stepsBeforeLast + 2;
    }
}