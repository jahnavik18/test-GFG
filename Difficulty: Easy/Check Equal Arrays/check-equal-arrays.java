class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
           Arrays.sort(a);
        Arrays.sort(b);                       // M - 1
   
    return Arrays.equals(a , b);
    }
}