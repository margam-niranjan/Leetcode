class Solution {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            Arrays.fill(children,null);
            eow = false;
        }
    }
    static Node root = new Node();

    public void insert(String word){
        Node current = root;
        for(int i = 0 ; i<word.length() ; i++){
            int ind = word.charAt(i) - 'a';
            if(current.children[ind] == null) current.children[ind] = new Node();
            current = current.children[ind];
        }
        current.eow = true;
    }
    public String prefix(String[] words){
        if (words == null || words.length == 0) return "";
        if (words.length == 1) return words[0];
        root = new Node();
        for(String s : words) insert(s);
        Node current = root;
        StringBuilder str = new StringBuilder();
        while(true){
            int ind = -1, count = 0;
            for(int i = 0 ; i<26 ; i++){
                if(current.children[i] != null) {
                    count++;
                    ind = i;
                }
            }
            if(count != 1 || current.eow) break;
            str.append((char)(ind +'a'));
            current = current.children[ind];
        }
        return str.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        return prefix(strs);
    }
}