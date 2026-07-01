import java.util.Stack; 
public class twosumtree{
  public static  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
        this.left = left;
          this.right = right;
     }
  }
  Stack<TreeNode> asc = new Stack<>();
  Stack<TreeNode> desc = new Stack<>();

public boolean  main(TreeNode root , int k  ) {
    if(root == null){
        return false  ; 
    }
    TreeNode t = root ; 
    while (t != null){
        asc.push(t);
         t = t.left ; 
    } 
    t = root ; 
    while (t != null ){
        desc.push(t);
        t = t.right ; 
    }
    TreeNode l = getsmall();
    TreeNode r = getlarge();
    while (l.val < r.val && l.val != r.val){
        int sum = r.val+ t.val ;
        if(sum == k ){
            return true ; 
        }
        else if(sum < k ){
            l = getsmall();
        }
        else r = getlarge();
    }
    return false ; 
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
public TreeNode getlarge(){
    if(desc.isEmpty()){
        return null ; 
    }
    TreeNode large = desc.pop();
    TreeNode t = large.left;
    while(t != null){
        desc.push(t);
        t = t.right ; 
    }
    return large ; 
}
public static void  main(String[] args) {

    twosumtree obj = new twosumtree();

        // BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int k = 9;
         boolean ans =  obj.main(root, k);
         System.out.println(ans );
    }
}