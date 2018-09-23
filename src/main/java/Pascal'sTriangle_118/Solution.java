class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] array = new int[numRows][numRows];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> single = new ArrayList<>();
            for(int j = 0;j < i+1;j++){
                if(j == 0 || j == i || i == 0)
                    array[i][j] = 1;
                else
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                single.add(array[i][j]);
            }
            list.add(single);
        }
        return list;
    }
}