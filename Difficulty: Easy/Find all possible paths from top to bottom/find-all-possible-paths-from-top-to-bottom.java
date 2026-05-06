import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m, int[][] mat) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();

        solve(0, 0, n, m, mat, currentPath, result);
        
        return result;
    }

    private static void solve(int i, int j, int n, int m, int[][] mat, 
                              ArrayList<Integer> currentPath, 
                              ArrayList<ArrayList<Integer>> result) {
        
        if (i >= n || j >= m) {
            return;
        }

        currentPath.add(mat[i][j]);

        if (i == n - 1 && j == m - 1) {
            result.add(new ArrayList<>(currentPath));
        } else {
            solve(i + 1, j, n, m, mat, currentPath, result);
            solve(i, j + 1, n, m, mat, currentPath, result);
        }
        currentPath.remove(currentPath.size() - 1);
    }
}