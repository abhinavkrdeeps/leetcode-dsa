package tree;

import java.util.*;

public class TreeDfsTraversal {

    public static void postOrdTrav(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        postOrdTrav(root.left,list);
        postOrdTrav(root.right,list);
        list.add(root.val);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrdTrav(root,list);
        return list;
    }

    public static void inOrdTrav(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }

        inOrdTrav(root.left,list);
        list.add(root.val);
        inOrdTrav(root.right,list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrdTrav(root,list);
        return list;
    }

    public static void preOrdTrav(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }

        list.add(root.val);
        preOrdTrav(root.left,list);
        preOrdTrav(root.right,list);

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        preOrdTrav(root,list);
        return list;

    }
}
