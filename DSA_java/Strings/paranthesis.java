class Solution {
    public int[] maxDepthAfterSplit(String seq) {
       int open = 0 ; int [] ans = new int[seq.length()];
       for(int i = 1 ; i < seq.length() ;i++){
          char ch = seq.charAt(i);
          if(ch == '('){
            open++;
            ans[i] = open%2;
          }
          else if(ch == ')'){
            ans[i] = open%2;
            open--;
          }
        
       }
        return ans ;
    }
}