
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length(); 
                }
                return a.compareTo(b); 
            }
        });
        return nums[nums.length - k];
    }
}