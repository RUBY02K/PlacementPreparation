package DSA_java.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int length = 0 ; 
        HashMap<Character , Integer> have = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            have.put(ch ,have.getOrDefault(ch, 0 )+1);
        }
        boolean odd = false;
       for(char ch :have.keySet()){
        if(have.get(ch)%2==0){
            length += have.get(ch);
        }
        else {
            length += have.get(ch)-1;
            odd = true ; 
        }
       }
        if (odd) {
            return length + 1;
        }
        return length ;  
    }
}
