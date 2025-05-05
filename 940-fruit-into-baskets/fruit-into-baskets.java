class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmm = new HashMap<>();
        int l=0,r=0,max = 0;
        while(r<fruits.length){
            hmm.put(fruits[r],hmm.getOrDefault(fruits[r],0)+1);
            while(hmm.size()>2){
                hmm.put(fruits[l],hmm.get(fruits[l])-1);
                if(hmm.get(fruits[l])<=0){
                    hmm.remove(fruits[l]);
                }
                l++;
            }
            if(hmm.size()<=2){
            int len = r-l+1;
            max = Math.max(max,len);
            r++;
            }
        }
        return max;
    }
}