class Solution {
    boolean numflag = false;
    
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        if(word.contains("@") ||word.contains("#") || word.contains("$") ) return false;
        if((isUpper(word) || isLower(word) || isNum(word)) && isVowel(word) && isConsonant(word)){
            return true;
        }
        return false;
    }
    
    public static boolean isNum(String str) { 
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isLower(String str){
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isUpper(String str){
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isVowel(String str){
        char[] chars = str.toLowerCase().toCharArray();
        for(char c : chars){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isConsonant(String str){
    char[] chars = str.toLowerCase().toCharArray(); // Convert the string to lowercase
    for(char c : chars){
        if(Character.isLetter(c)) { // Check if the character is a letter
            // If the character is not a vowel, it's a consonant
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                return true;
            }
        }
    }
    
    return false;
}
}