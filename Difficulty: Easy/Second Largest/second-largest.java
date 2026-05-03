class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         // code here

        int max = -1;

        int smax = -1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max)

              max = arr[i];

       

        }

        for(int i = 0;i< arr.length;i++){

        if(arr[i] > smax && arr[i] != max)

             smax = arr[i];

    

        }

        return smax;

        
    }
}