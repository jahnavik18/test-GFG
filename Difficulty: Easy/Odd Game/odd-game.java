

class Solution {
    static Long oddGame(Long N) {
        // code here
           long arr=1;
        while(arr*2<=N){
            arr=arr*2;
        }
        return arr;
    }
};