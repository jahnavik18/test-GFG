class Solution {
    public int minDiff(int[] nums) {
        // code here
         Arrays.sort(nums);
        int sub = 0;
        int min = Integer.MAX_VALUE;
        if(nums.length%2==0){
            for(int i = 1;i<nums.length;i++){
                sub = nums[i] - nums[i-1];
                min = Math.min(sub,min);
            }
        }
        else{
            for(int i = 1;i<nums.length-2;i++){
                sub = nums[i] - nums[i-1];
                min = Math.min(sub,min);
            }
        }
        return min;
    }
}
