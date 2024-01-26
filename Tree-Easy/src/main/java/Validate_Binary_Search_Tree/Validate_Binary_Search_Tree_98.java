package Validate_Binary_Search_Tree;
import TreeNode.TreeNode;
/*
    WRONG!! Only consider this level
    public boolean isValidBST(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.val <= root.left.val){
            return false;
        }
        if(root.right != null && root.val >= root.right.val){
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    brainstorm;
    calling on inorder traversal first checks the leftSub then rightSub

 */
public class Validate_Binary_Search_Tree_98 {
    public TreeNode prev;
    public boolean isValidBST(TreeNode root){
        prev = null;
        return inorderTraversal(root);
    }
    public boolean inorderTraversal(TreeNode root){
        if(root == null){
            return true;
        }
        if(!inorderTraversal(root.left)){
            return false;
        }
        if(prev != null && prev.val >= root.val){
            return false;
        }
        prev = root;
        return inorderTraversal(root.right);

    }

}
