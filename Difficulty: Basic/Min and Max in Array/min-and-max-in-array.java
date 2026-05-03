class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
           // code Here
        Arrays.sort(arr);
        
        int lastIndex = arr.length -1;
        
        ArrayList<Integer> list = new ArrayList<>(2);
        
        int min = arr[0];
        int max =  arr[lastIndex];
        list.add(min);
        list.add(max);
        
        return list;
    }
}
