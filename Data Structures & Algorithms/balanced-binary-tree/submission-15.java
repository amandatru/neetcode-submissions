/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return calculateHeight(root) != -1;
    }

    private int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var left = calculateHeight(root.left);
        if (left == -1) {
            return -1;
        }
        var right = calculateHeight(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(right - left) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
