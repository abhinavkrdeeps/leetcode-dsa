package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeight {
    public int maxDepthRec(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepthRec(root.left)+1, maxDepthRec(root.right)+1);

    }


    public int maxDepthBfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int depth=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        depth++;
        while (!queue.isEmpty()){
            int level = queue.size();
            for(int i=0;i<level;i++){
                TreeNode treeNode = queue.peek();
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                queue.poll();
            }
            depth++;
        }
        return depth;
    }
}
