class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = findFirst(arr, target);
        if (first == -1) return 0; // Target not found
        
        int last = findLast(arr, target);
        return last - first + 1;
    }

    private int findFirst(int[] arr, int x) {
        int l = 0, h = arr.length - 1;
        int first = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == x) {
                first = m;
                h = m - 1; // Keep looking left
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return first;
    }

    private int findLast(int[] arr, int x) {
        int l = 0, h = arr.length - 1;
        int last = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == x) {
                last = m;
                l = m + 1; // Keep looking right
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return last;
    }
}
