class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int l = 0 , r = n-1;
        long sum = 0;
        int total = skill[0] + skill[n-1];
        while(l<r){
            if(skill[l] + skill[r] != total){
                return -1;
            }
            int temp = skill[l] * skill[r];
            sum+=temp;
            l++;r--;
        }
        return sum;
    }
}