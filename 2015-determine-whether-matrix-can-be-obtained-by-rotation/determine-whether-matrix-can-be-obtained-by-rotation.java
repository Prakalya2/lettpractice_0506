import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        if (Arrays.deepEquals(mat, target))
            return true;

        for (int k = 0; k < 3; k++) {
            mat = rotate(mat);

            if (Arrays.deepEquals(mat, target))
                return true;
        }

        return false;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }

        return res;
    }
}