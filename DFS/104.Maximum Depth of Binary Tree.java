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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return DFS(root);
    }

    private int DFS(TreeNode root) {
        int max = 0;
        if (root.left != null) {
            max = Math.max(max, DFS(root.left));
        }
        if (root.right != null) {
            max = Math.max(max, DFS(root.right));
        }
        max += 1;

        return max;
    }
}