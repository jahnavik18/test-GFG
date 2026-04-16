class Solution {
    public int findSum(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        int sum =0;
        int n = s.length();
        
        
        for(int i=0; i<n;i++){
            char curr = s.charAt(i);
            if(Character.isDigit(curr)){
                ans.append(curr);
            }
            else if(!ans.isEmpty()){
                sum += Integer.parseInt(ans.toString());
                ans.setLength(0);
            }
        }
        
        if(ans.length()>0){
            sum +=Integer.parseInt(ans.toString());
        }
        return sum;
    }
}