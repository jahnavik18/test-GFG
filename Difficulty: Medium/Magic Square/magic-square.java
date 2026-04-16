class Solution {
    public boolean magicSquare(int[][] mat) {
        // code here
          int n = mat.length;
        int n2 = n * n;
        boolean[] seen = new boolean[n2 + 1];
        int targetSum = 0;

        // 1. Calculate target sum from the first row and check elements
        for (int j = 0; j < n; j++) {
            int val = mat[0][j];
            if (val < 1 || val > n2 || seen[val]) return false;
            seen[val] = true;
            targetSum += val;
        }

        // 2. Check remaining rows and element range/uniqueness
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                if (val < 1 || val > n2 || seen[val]) return false;
                seen[val] = true;
                rowSum += val;
            }
            if (rowSum != targetSum) return false;
        }

        // 3. Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }
            if (colSum != targetSum) return false;
        }

        // 4. Check diagonals
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += mat[i][i];
            diag2 += mat[i][n - 1 - i];
        }

        return diag1 == targetSum && diag2 == targetSum;
    }
}