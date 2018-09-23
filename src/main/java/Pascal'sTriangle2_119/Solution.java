class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] prevArray = new int[1];
        rowIndex += 1;
        List<Integer> resultList = new ArrayList<>();
        for(int row = 1;row <= rowIndex;row++){
            int[] array = new int[row];
            
            if(row == 1 || row == 2){
                array[0] = 1;
                array[row-1] = 1;
            }
            else{
                for(int k = 0;k < row;k++){
                    if(k == 0 || k == row-1)
                        array[k] = 1;
                    else{
                        int len = prevArray.length;
                        array[k] = prevArray[len-(row-k)]+prevArray[len-(row-k)+1];
                    }
                }
            }
            prevArray = new int[row];
            for(int j = 0;j < row;j++){
                prevArray[j] = array[j];
            }
            if(row == rowIndex){
                for(int m = 0;m < rowIndex;m++){
                    resultList.add(array[m]);
                }
            }
        }
        return resultList;
    }
}