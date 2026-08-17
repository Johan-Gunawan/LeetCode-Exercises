import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList result1 = DFS(root1, new ArrayList<>());
        ArrayList result2 = DFS(root2, new ArrayList<>());

        return result1.equals(result2);

    }

    private ArrayList<Integer> DFS(TreeNode root, ArrayList<Integer> result) {
        if (root.right == null && root.left == null) {
            result.add(root.val);
            return result;
        } else {
            if (root.left != null) {
                DFS(root.left, result);
            }
            if (root.right != null) {
                DFS(root.right, result);
            }
        }

        return result;
    }
}