class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        boolean found = false;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                found = true;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        if (!found) {
            return new int[]{-1, -1};
        }

        int left = mid, right = mid;
        while (left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }
        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }

        return new int[]{left, right};
    }
}