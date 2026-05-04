// User function Template for Java

class Solution {
    static int isLuckyOrNot(Long N) {
        // code here
                String num = N.toString();
        int len=num.length();
        java.util.HashSet<Long>set = new java.util.HashSet<>();
        for(int i = 0;i<len;i++){
            long product = 1;
            for (int j = i;j<len;j++){
                product *= (num.charAt(j)-'0');
                if(set.contains(product)){
                    return 0;
                }
                set.add(product);
            }
       }
    return 1;
    }
};