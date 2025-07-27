class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        float[] time = new float[target+1];
        for(int i = 0 ;i<n ; i++){
            time[position[i]] = (float)(target - position[i])/speed[i];
        }
        int count = 0;
        float max = 0;
        for(int i = target ; i>= 0 ; i--){
            if(time[i] > max){
                count ++;
                max = time[i];
            }
        }
        return count;
    }
}