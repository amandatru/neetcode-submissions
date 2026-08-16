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
//check if p q are less than root, then check left side
// if p and q are more than root, check right side
//if any one of them is less than root, and one of them more than root, then return root

class Solution { // p = 2 q = 4
    private TreeNode node;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root.val >= p.val && root.val <= q.val || root.val <= p.val && root.val >= q.val) {
            return root;
        }

        if (root.val > p.val && root.val > q.val) {
          node = lowestCommonAncestor(root.left, p, q);
        }

        if (root.val < p.val && root.val < q.val) {
           node = lowestCommonAncestor(root.right, p, q);
        }

        return node;
    }
}
