// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
          int[] ans = new int[n];
        ans[0] = 0;
        if(n > 1){
            ans[1] = 1;
        }
        
        for(int i = 2; i < n; i++){
            ans[i] = fibbonaci(i);
        }
        return ans;
    }
    
    public static int fibbonaci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }
}