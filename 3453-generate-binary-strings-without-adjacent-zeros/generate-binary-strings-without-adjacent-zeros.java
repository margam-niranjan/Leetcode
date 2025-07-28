class Solution {
    public List<String> validStrings(int n) {
        List<String> lst = new ArrayList<>();
        generate(lst,new StringBuilder(),n);
        return lst;
    }
    void generate(List<String> lst, StringBuilder str, int n){
        if(str.length()>1 && str.charAt(str.length()-1) == '0' && str.charAt(str.length()-2) == '0')return;
        if(str.length() == n){
            lst.add(str.toString());
            return;
        }
        generate(lst, str.append('0'), n);
        str.deleteCharAt(str.length()-1);
        generate(lst, str.append('1'), n);
        str.deleteCharAt(str.length()-1);
        
    }

}