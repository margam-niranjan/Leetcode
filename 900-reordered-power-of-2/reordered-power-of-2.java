class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] arr=count(n);

        int num=1;

        for(int i=0;i<32;i++){
            if(Arrays.equals(arr,count(num))){
                return true;
            }
            num*=2;
        }
        return false;
    }

    public int[] count(int num){
        int[] freq=new int[10];

        while(num>0){
            freq[num%10]++;
            num/=10;
        }
        return freq;
    }
}