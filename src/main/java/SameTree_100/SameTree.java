package main.java.SameTree_100;

public class SameTree {
    public boolean isSameTreeRecursion(TreeNode p,TreeNode q){
        if(p == null && q == null) return true;
        else if(p == null && q != null || p != null && q == null) return false;
        else if(p.val != q.val) return false;
        else return isSameTreeRecursion(p.left, q.left) && isSameTreeRecursion(p.right, q.right);
    }

    public boolean isSameTreeIteration(TreeNode p, TreeNode q){
        return true;
    }

     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
