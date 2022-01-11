package tree;

public class PathSum {
    public boolean pathSum(TreeNode root, int sum, int targetSum){

        if(root==null){
            return false;
        }
        int csum = sum+root.val;

        if(csum==targetSum){
            if(root.left==null && root.right==null){
                return true;
            }
        }
        return pathSum(root.left,csum,targetSum) || pathSum(root.right,csum,targetSum);



    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int sum = 0;
        return  pathSum(root,0,targetSum);


    }
}
