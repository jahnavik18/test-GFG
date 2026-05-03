class Solution {
    int missingNum(int arr[]) {
        // code here
         int diff=0;
        for(int i=0; i <arr.length ; ++i)
        {
            diff+=i+1 - arr[i];
        }
        return diff+arr.length+1;
    }
}