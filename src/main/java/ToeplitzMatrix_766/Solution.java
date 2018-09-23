class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean result = true;
        int row = matrix.length;
        int column = matrix[0].length;
        for(int c = 1;c < column;c++){
            int x = row-1;
            int y = c;
            while(x!=0 && y!=0){
                if(matrix[x][y] != matrix[x-1][y-1]){
                    result = false;
                    break;
                }
                x--;
                y--;
            }
            if(!result) break;
        }
        for(int r = 1;r < row;r++){
            int x = r;
            int y = column-1;
            while(x!=0 && y!=0){
                if(matrix[x][y] != matrix[x-1][y-1]){
                    result = false;
                    break;
                }
                x--;
                y--;
            }
            if(!result) break;
        }
        return result;
    }
}