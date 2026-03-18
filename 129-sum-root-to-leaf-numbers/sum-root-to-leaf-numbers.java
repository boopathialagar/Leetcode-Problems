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
    int sum;

    public void findNumber(TreeNode root, int n) {
        if(root==null)return;
        n = (n * 10) + root.val;
        if (root.left == null && root.right == null) {
            sum = sum + n;
            return;
        }
        findNumber(root.left, n);
        findNumber(root.right, n);
    }

    public int sumNumbers(TreeNode root) {
        sum = 0;
        findNumber(root, 0);
        return sum;
    }
}