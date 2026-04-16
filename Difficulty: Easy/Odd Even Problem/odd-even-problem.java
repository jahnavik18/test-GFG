
class Solution {
    public static String oddEven(String s) {
        // code here
          int[] freq = new int[27]; 
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a' + 1]++;
        }
        
        int x = 0; 
        int y = 0; 
        for (int i = 1; i <= 26; i++) {
            if (freq[i] > 0) {
                if (i % 2 == 0) {
                    if (freq[i] % 2 == 0) {
                        x++;
                    }
                } 
                else {
                    if (freq[i] % 2 != 0) {
                        y++;
                    }
                }
            }
        }
        return (x + y) % 2 == 0 ? "EVEN" : "ODD";
    }
}
