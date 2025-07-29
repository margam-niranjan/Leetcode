class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length -1 ;
       while(top <= bottom){
          int mid = (top + bottom) / 2;
          if(matrix[mid][0] < target && matrix[mid][matrix[mid].length - 1] > target) break;
          else if(matrix[mid][0] > target) bottom = mid - 1;
          else top = mid + 1;
       }
       int tarRow = (top + bottom) / 2;
       while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[tarRow][mid] == target) return true;
            else if(matrix[tarRow][mid] > target) right = mid - 1;
            else left = mid + 1;
       }
       return false;
    }
}