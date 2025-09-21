class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        boolean[] check = new boolean[101];
        for(int i = 0 ; i<friends.length ; i++){
            check[friends[i]] = true;
        }
        int res[] = new int[friends.length];
        int j = 0;
        for(int i = 0 ; i<order.length ; i++){
            if(check[order[i]]){
                res[j++] = order[i];
            }
        }
        return res;
    }
}