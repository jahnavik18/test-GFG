class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        long s=0;
        for(long i=1;i<=n;i++){
            s+=i*(n/i);
        }
        return s;
    }
}