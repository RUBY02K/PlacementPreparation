/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
      ArrayList<Integer> temp = new ArrayList<>();
      fun(root , temp);
      int i =0 ; int j = temp.size()-1;
      while (i < j ){
        if(temp.get(i) + temp.get(j)== k){
        return true ;
        }
        else if(temp.get(i)+temp.get(j)>k){
            j--;
        }
        else i++;
      }
        return false ;
    }
    public void fun(TreeNode root , ArrayList<Integer> temp){
        if(root == null)return ;
        fun(root.left , temp);
        temp.add(root.val);
        fun(root.right , temp);
    return ; 
    }
}