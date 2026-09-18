class Solution {
    public boolean isPathCrossing(String path) {
        int x =0 ; int y  = 0 ;
        HashSet<String> set = new HashSet<>();
        set.add(x +","+y);
        for(int i = 0 ; i < path.length() ; i++){
            char ch = path.charAt(i);
            if(ch == 'N'){
                y++;
            }
            else if(ch == 'E'){
                x++;
            }
            else if (ch == 'W'){
                x--;
            }
            else {
                y--;
            }
             String position = x + "," + y;
             if(set.contains(position)){
                return true ;
             }
             set.add(position);
             
        }
        return false ;
    }
}