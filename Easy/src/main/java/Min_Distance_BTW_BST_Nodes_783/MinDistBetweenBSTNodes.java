package Min_Distance_BTW_BST_Nodes_783;

import TreeNode.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class MinDistBetweenBSTNodes {
    public static void main(String[] args) {

    }

    public int minVal = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root){
        Set<TreeNode> set = new HashSet<>();
        dfs(set, root);
        return minVal;
    }

    public void dfs(Set<TreeNode> set, TreeNode root){
        if(root == null){
            return;
        }
        /*
            1st error did not put the rest of code inside of
            if(!set.contains(root))
            {}

         */
        if(!set.contains(root)){
            set.add(root);
            for(TreeNode node: set){
                minVal = Math.min(minVal, Math.abs(root.val - node.val));

            }
            if(root.right != null){
                dfs(set, root.right);
            }
            if(root.left != null){
                dfs(set, root.left);
            }
        }
    }
}
