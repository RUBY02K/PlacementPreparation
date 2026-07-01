class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, 0, targetSum);
    }

    public boolean fun(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return false;
        }

        sum += root.val;

        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return fun(root.left, sum, targetSum) ||
               fun(root.right, sum, targetSum);
    }
}