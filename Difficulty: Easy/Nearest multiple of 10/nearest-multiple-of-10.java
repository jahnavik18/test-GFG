class Solution {
    public String roundToNearest(String str) {
        int n = str.length();

        if (str.charAt(n - 1) - '0' <= 5) {

            
            str = str.substring(0, n - 1) + '0';

           
            return str;
        }
        else {
            
            str = str.substring(0, n - 1) + '0';

            
            int carry = 1;
            char[] chars = str.toCharArray();
            for (int i = n - 2; i >= 0 && carry == 1; i--) {
                int currentDigit = chars[i] - '0';
                currentDigit += carry;

                
                if (currentDigit > 9) {
                    carry = 1;
                    currentDigit = 0;
                }
               
                else {
                    carry = 0;
                }

                
                chars[i] = (char)(currentDigit + '0');
            }

            
            if (carry == 1) {
                return '1' + new String(chars);
            }

            return new String(chars);
        }
    }
}