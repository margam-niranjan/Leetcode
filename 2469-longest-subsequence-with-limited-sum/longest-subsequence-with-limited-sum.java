class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        int arr[]=new int[queries.length];
            for(int i=0;i<queries.length;i++){
                int q=queries[i];
                int low=0;
                int high=nums.length-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                   if(nums[mid]==q){
                    arr[i]=mid+1;
                    break;
                   }
                   else if(nums[mid]<q){
                    arr[i]=mid+1;
                    low=mid+1;
                   }
                   else{
                    high=mid-1;
                   }
                }
            }
            return arr;
        }    
}