class Solution {
    public String firstPalindrome(String[] words) {
       for(String word : words ){
        StringBuilder reverse =  new StringBuilder(word).reverse();
        if(reverse.toString().equals(word)){
            return word ; 
        }
       } 
       return "";
    }
}