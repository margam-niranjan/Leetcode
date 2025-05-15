class Solution {
    public void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void swap(int[] nums, int i, int j) {
        if (i != j) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }

    public int[] sortArray(int[] nums) {
        

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int n1 = low, n2 = mid + 1, res = 0;
        while (n1 <= mid && n2 <= high) {
            if (nums[n1] <= nums[n2]) {
                temp[res++] = nums[n1++];
            } else {
                temp[res++] = nums[n2++];
            }

        }
        while (n1 <= mid) {
            temp[res++] = nums[n1++];
        }
        while (n2 <= high) {
            temp[res++] = nums[n2++];
        }
        for (int p = 0; p < temp.length; p++) {
            nums[low + p] = temp[p];
        }
    }
}