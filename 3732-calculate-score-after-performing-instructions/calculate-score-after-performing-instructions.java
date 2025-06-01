class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long res = 0; 
        long i = 0;
        boolean vis[] = new boolean[values.length];
        while (i < values.length && i>=0 && !vis[(int) i]) {
            if(i<0 || i>=values.length || vis[(int) i]) 
                break;
            vis[(int) i] = true;
            if (instructions[(int) i].equals("jump")) {
                i += values[(int) i];
            } else{
                res += values[(int) i];
                i++;
            }
        }
        return res;
    }
}
