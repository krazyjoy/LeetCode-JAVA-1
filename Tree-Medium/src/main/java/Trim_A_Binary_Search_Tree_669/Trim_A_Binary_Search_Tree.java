package Trim_A_Binary_Search_Tree_669;
import TreeNode.TreeNode;

import java.awt.print.Pageable;

/*
    Given the "root" of a bst and the lowest and highest boundaries as "low" and "high"
    trim the tree so that all its elements lies in [low, high]

    brainstorm

    if root node < low:
        return root.right
    if root node > high:
        return root.left
 */
public class Trim_A_Binary_Search_Tree {
    public TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null){
            return root;
        }
        if(root.val < low){
            return root.right;
        }
        else if(root.val > high){
            return root.right;
        }
        else{
            return root;
        }

    }
}
