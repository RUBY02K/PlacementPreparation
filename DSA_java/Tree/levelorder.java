class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int levelsize = q.size();
            List<Integer> temp = new ArrayList<>();

            while(levelsize-- > 0){

                TreeNode t = q.poll();
                temp.add(t.val);

                if(t.left != null){
                    q.offer(t.left);
                }

                if(t.right != null){
                    q.offer(t.right);
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}