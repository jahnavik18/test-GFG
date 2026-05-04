class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
          ArrayList<Integer> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        Set<Integer> keySet=map.keySet();
        for(Integer key:keySet){
            int count=map.get(key);
            if(count>1){
                result.add(key);
            }
        }
        return result;
    }
}