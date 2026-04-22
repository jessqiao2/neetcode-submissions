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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // base case 
        if (p == null && q == null) {
            return true;
        } else if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }

        // check if the current values differ
        if (p.val != q.val) {
            return false;
        }

        // recurse through left and right
        boolean leftComparison = isSameTree(p.left, q.left);
        boolean rightComparison = isSameTree(p.right, q.right);

        // return if both left and right are true
        return leftComparison && rightComparison;
        
    }
}
