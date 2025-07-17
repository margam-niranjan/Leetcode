class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i =1 ; i<=n ; i++){
            int j = i;
            int count = 0;
            while(j>0){
                if( (j&1) == 1) count++;
                j = j>>1;
            }
            arr[i] = count;
        }
        return arr;
    }
}