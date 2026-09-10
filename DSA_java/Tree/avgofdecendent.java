class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        // left subtree
        int[] left = dfs(root.left);

        // right subtree
        int[] right = dfs(root.right);

        // current subtree ka sum
        int sum = left[0] + right[0] + root.val;

        // current subtree ke nodes
        int count = left[1] + right[1] + 1;

        // average check
        if (sum / count == root.val) {
            ans++;
        }

        return new int[]{sum, count};
    }
}