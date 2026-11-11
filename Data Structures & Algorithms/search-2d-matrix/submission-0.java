class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row * col - 1;
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int currRow = mid / col;
            int currCol = mid % col;
            if (matrix[currRow][currCol] == target)
                return true;
            else if (matrix[currRow][currCol] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
