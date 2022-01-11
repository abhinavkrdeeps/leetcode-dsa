package tree;

public class SymmetricalTree {

    public boolean isSymmetry(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null){
            return false;
        }
        if(right==null){
            return false;
        }
        if(left.val== right.val){
            boolean l = isSymmetry(left.left,right.right);
            boolean r = isSymmetry(left.right,right.left);
            return l&r;
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetry(root.left,root.right);

    }
}
