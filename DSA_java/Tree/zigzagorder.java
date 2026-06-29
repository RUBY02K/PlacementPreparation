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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ltr = true;

        while (!q.isEmpty()) {
            int levelsize = q.size();
            List<Integer> temp = new ArrayList<>();

            while (levelsize-- > 0) {
                TreeNode t = q.poll();

                if (ltr) {
                    temp.add(t.val);
                } else {
                    temp.add(0, t.val); // reverse insert
                }

                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }

            ans.add(temp);
            ltr = !ltr; // level ke baad flip
        }

        return ans;
    }
}