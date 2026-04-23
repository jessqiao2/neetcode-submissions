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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // if subtree is null, return true 
        // empty stree is always a subtree
        if (subRoot == null){
            return true;
        }

        // if root is empty but subroot is not, return false
        if (root == null){
            return false;
        }

        // check if the trees are the same from the root
        if (sameTree(root, subRoot)) {
            return true;
        }

        // return true if either left subtree or right subtree is true
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);

    }

    // function to check if it is the same tree
    public boolean sameTree(TreeNode root, TreeNode subRoot) {

        // base case - if root and subroot is null, return true
        if (root == null && subRoot == null){
            return true;
        }

        // if the values are the same, recurse through left and right subtrees
        if (root != null && subRoot != null && root.val == subRoot.val) {
            return sameTree(root.left, subRoot.left) && 
                   sameTree(root.right, subRoot.right);
        }

        return false;

    }
}
