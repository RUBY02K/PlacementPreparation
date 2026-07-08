/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return fun(preorder, 0, inorder.length - 1);
    }

    public TreeNode fun(int[] preorder, int low, int high) {

        if (low > high) {
            return null;
        }

        int value = preorder[preIndex++];
        TreeNode node = new TreeNode(value);

        int mid = map.get(value);

        node.left = fun(preorder, low, mid - 1);
        node.right = fun(preorder, mid + 1, high);

        return node;
    }
}