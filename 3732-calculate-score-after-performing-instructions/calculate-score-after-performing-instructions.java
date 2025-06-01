class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long res = 0; 
        long i = 0;
        boolean vis[] = new boolean[values.length];
        while (i < values.length && i>=0 && !vis[(int) i]) {
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
