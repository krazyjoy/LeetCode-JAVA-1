package Recover_Binary_Search_Tree;
import TreeNode.TreeNode;
import sun.reflect.generics.tree.Tree;

/*
    https://leetcode.com/problems/recover-binary-search-tree/description/
    You are given the "root" of a binary search tree (BST), where the values of exactly two
    nodes of the tree were swapped by mistake.
    Recover the tree without changing its structure

    WRONG:
    While inorder traversing, swap the prev and node if placed incorrectly

    CORRECT:
    remember the TreeNode's val of incorrect placements while traversing,
    coming back then swap the two values.

    This is because we don't want to swap result to affect the inorder traversal


 */
public class Recover_Binary_Search_Tree_99 {
    public TreeNode prev=null, first=null, second=null;
    public void recoverTree(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root);
        swap(first, second);
    }
    public void inorderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        if(prev != null && prev.val >= node.val){
            // only captures the first pair
            if(first == null){
                first = prev;
            }
            second = node;
        }
        inorderTraversal(node.right);
    }
    public void swap(TreeNode a, TreeNode b){
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}
