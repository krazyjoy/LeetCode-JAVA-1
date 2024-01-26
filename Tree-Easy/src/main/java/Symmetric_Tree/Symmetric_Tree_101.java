package Symmetric_Tree;
import TreeNode.TreeNode;
/*
    Given the "root" of a binary tree, check whether it is a mirror of itself

    brainstorm:
    root node value of left subtree and right subtree equals

    leftRoot.left == rightRoot.right
    leftRoot.right == rightRoot.left

 */
public class Symmetric_Tree_101 {
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }

        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }

        if(leftNode == null || rightNode == null){
            return false;
        }

        if(leftNode.val != rightNode.val){
            return false;
        }


        return isSymmetricTree(leftNode.left, rightNode.right) && isSymmetricTree(leftNode.right, rightNode.left);

    }
}
