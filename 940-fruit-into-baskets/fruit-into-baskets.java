class Solution {
    public int totalFruit(int[] a) {
        HashSet<Integer> set=new HashSet<>();
        int l=0,r=0,n=a.length,max=0;
        while(r<n){
            set.add(a[r]);
            if(set.size()>2){
                set.clear();
                l=r-1;
                while(a[l]==a[l-1]) l--;
                set.add(a[l]);
                set.add(a[r]);
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}