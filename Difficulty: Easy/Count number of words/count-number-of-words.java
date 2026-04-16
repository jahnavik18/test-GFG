// User function Template for Java
class Solution {
    int countWords(String s) {
        // code here
           // String trimmed = s.trim();
        String cleaned = s.replace("\\n", " ").replace("\\t", " ");
        String trimmed = cleaned.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
    return trimmed.split("\\s+").length;
    }
}