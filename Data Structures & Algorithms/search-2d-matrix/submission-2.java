class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(target > matrix[mid][m-1]){
                low = mid + 1;
            }
            else if(target < matrix[mid][0]){
                high = mid - 1;
            }
            else{
                // Search inside row
                int l = 0;
                int h = m - 1;

                while(l <= h){
                    int md = (l+h)/2;

                    if(matrix[mid][md]==target)
                        return true;

                    else if(matrix[mid][md]<target)
                        l=md+1;

                    else
                        h=md-1;
                }

                return false;
            }
        }

        return false;
    }
}