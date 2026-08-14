class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
         int m = word2.length();
        int i = 0 ; 
        while (i < n && i < m){
            char ch1 = word1.charAt(i);
            sb.append(ch1);
            char ch2 = word2.charAt(i);
            sb.append(ch2);
            i++;
        }
        if(i < n ){
            sb.append(word1.charAt(i));
            i++;
        }
        if(i < m ){
            sb.append(word2.charAt(i));
            i++;
        }
      return sb.toString();
    }
}