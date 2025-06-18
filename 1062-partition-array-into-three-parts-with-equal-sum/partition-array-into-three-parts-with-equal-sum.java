class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        if(sum % 3 != 0) return false;
        int expected = sum / 3;
        int ans = 0;
        int count =0;
        for(int i = 0 ; i < arr.length-1; i++){
            ans+= arr[i];
            if(ans == expected){
                count ++;
                ans = 0 ;
            }
            if(count == 2 ) return true;
        }
        return false;
    }
}