class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = 0;
        int[] store = new int[c*r];
        int cursor = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                size++;
                store[cursor++] = nums[i][j];
            }
        }
        if(r*c != size) return nums;
        else{
            cursor = 0;
            int[][] result = new int[r][c];
            for(int i = 0;i < r;i++){
                for(int j = 0;j < c;j++){
                    result[i][j] = store[cursor++];
                }
            }
            return result;
        }
    }
}