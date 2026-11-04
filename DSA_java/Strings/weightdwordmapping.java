class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        long rem = 0 ; StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            long sum = 0 ;
           String s = words[i];
            for(int j=0 ; j < s.length();j++){
               char ch = s.charAt(j);
               sum+= weights[ch - 'a'];
            }
            rem = sum%26;
          sb.append((char)('z' - rem));
        }
        return sb.toString();
    }
}