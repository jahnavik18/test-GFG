// User function Template for Java

class Solution {
    public int no_ofString(int n) {
        // code here
        long N=(long)n;
        long mod = 1000000007;
        long res =1;
        res=(res+2*N)%mod;
        long term1b1c=(N*(N-1))%mod;
        res=(res+term1b1c)%mod;
        long term0b2c=(N*(N-1)/2)%mod;
        res=(res+term0b2c)%mod;
        long term1b2c=((N*(N-1)/2)%mod*(N-2))%mod;
        res=(res+term1b2c)%mod;
        return(int)(res%mod);
    }
}