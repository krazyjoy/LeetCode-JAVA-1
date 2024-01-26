package Max_Depth_Of_BT;
import TreeNode.TreeNode;

import java.awt.print.Pageable;

public class Max_Depth_Of_Binary_Tree_104 {
    public int max_depth=0;
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        getDepth(root, 1);
        return max_depth;

    }
    public void getDepth(TreeNode node, int depth){
        if(node == null){
            return;
        }
        // update current depth
        max_depth = Math.max(depth, max_depth);
        if(node.left != null){
            getDepth(node.left, depth+1);
        }
        if(node.right != null){
            getDepth(node.right, depth+1);
        }

    }
}
