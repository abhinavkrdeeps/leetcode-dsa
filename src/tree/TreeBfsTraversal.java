package tree;


import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class TreeBfsTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            for(int i=0;i<queue.size();i++){
                TreeNode treeNode = queue.peek();
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                levelList.add(treeNode.val);
                queue.remove();
            }
            lists.add(levelList);
        }
        return lists;

    }
}
