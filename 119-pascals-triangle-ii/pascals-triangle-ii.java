class Solution {
    public List<Integer> getRow(int rowIndex) {
        long res = 1L;
        List<Integer> lst = new ArrayList<>();
        lst.add((int) res);
        for (int i = 1; i <= rowIndex; i++) {
            res = res *(rowIndex-i+1) / i;
            lst.add((int)res);
        }
        return lst;
    }
}
