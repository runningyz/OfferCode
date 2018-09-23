class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> merged = new ArrayList<>();
        int cursor1 = 0;
        int cursor2 = 0;
        if(n == 0) return;
        while(cursor1 <= m-1 && cursor2 <= n-1){
            if(nums1[cursor1]<nums2[cursor2]){
                merged.add(nums1[cursor1]);
                cursor1++;
            }
            else{
                merged.add(nums2[cursor2]);
                cursor2++;
            }
        }
        while(cursor1 <= m-1){
            merged.add(nums1[cursor1]);
            cursor1++;
        }
        while(cursor2 <= n-1){
            merged.add(nums2[cursor2]);
            cursor2++;
        }
        for(int i = 0;i<m+n;i++){
            nums1[i] = merged.get(i);
        }
    }
}