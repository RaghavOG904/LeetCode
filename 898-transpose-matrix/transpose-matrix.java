class Solution {
    public int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] ans = new int[cols][rows];

        for ( int i = 0 ; i < rows ; i++ ){
            for ( int j = 0 ; j < cols ; j++ ){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }
}