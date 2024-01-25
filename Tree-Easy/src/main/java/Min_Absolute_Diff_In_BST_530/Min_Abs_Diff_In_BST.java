package Min_Absolute_Diff_In_BST_530;
import TreeNode.TreeNode;

/*
    https://leetcode.com/problems/minimum-absolute-difference-in-bst/
    Given the root of a Binary Search Tree (BST), return the minimum absolute difference
    between the values of any two different nodes in the tree

    In each step, compare the previous node value with the current root node value
    why inorder: in binary search tree inorder traversal gives an ascending order of lookup

 */
public class Min_Abs_Diff_In_BST {
    public int minAbsVal = Integer.MIN_VALUE;

    public int getMinimumDifference(TreeNode root){
        TreeNode prev = null;
        dfs(root, prev);
        return minAbsVal;
    }
    public void dfs(TreeNode root, TreeNode prev){
        if(root == null){
            return;
        }
        dfs(root.left, prev);
        if(prev != null){
            minAbsVal = Math.min(minAbsVal, Math.abs(prev.val - root.val));
        }
        prev = root;
        dfs(root.right, prev);
    }

}
