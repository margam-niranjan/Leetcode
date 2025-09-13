class Solution {
    public int minFlips(final String target) {
        final char[] array = target.toCharArray();
        
        int count = 0;
        char prev = '0';

        for(int i = 0; i < array.length; ++i) {
            if(prev != array[i])
                count++;

            prev = array[i];
        }

        return count;
    }
}