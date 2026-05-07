// User function Template for Java

class Solution {
    String gameResult(String s) {
        // your code here
           char A=s.charAt(0);
        char B=s.charAt(1);
        if(A==B)
        {
            return("DRAW");
        }
        if((A=='R'&& B=='S')||(A=='S'&& B=='P')||(A=='P'&& B=='R'))
        {
            return("A");
        }
            return("B");
    }
}