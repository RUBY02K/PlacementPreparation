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
    Stack<TreeNode > asc = new Stack<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        TreeNode t = root ; 
        while(t!=null){
            asc.push(t);
            t = t.left;
        }
        TreeNode ans = new TreeNode();
        while ( k-->0){
          ans = getsmall();
        }
        return ans.val; 
    }
    public TreeNode getsmall(){
        if(asc.isEmpty()){
            return null ;
        }
        TreeNode small = asc.pop();
        TreeNode t = small.right;
        while(t!= null){
            asc.push(t);
            t = t.left ; 
        }
        return small ; 
    }
}