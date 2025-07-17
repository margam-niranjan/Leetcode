class Solution {
    public int[][] merge(int[][] nums) {
        int i = 0;
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> lst = new ArrayList<>();
        while(i<nums.length){
            int start = nums[i][0];
            int end = nums[i][1];
            while( i < nums.length && nums[i][0]<=end){
               end = Math.max(end, nums[i][1]);
               i++;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            lst.add(temp);
        }
        int[][] arr = lst.stream()
            .map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
        return arr;

    }
}