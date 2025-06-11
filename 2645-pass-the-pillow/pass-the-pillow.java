class Solution {
    public int passThePillow(int n, int time) {
        boolean pass = (time / (n-1) % 2 == 0) ? true : false;
        if(!pass) return n - (time % (n-1));
        else return 1 + (time % (n-1));
    }
}