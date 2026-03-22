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
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        int res = -1;
        for(int i=0;i<list.size();i++){
            if(k==i+1)res = list.get(i);
        }
        return res;
    }
    public void inorder(TreeNode root){
        if(root == null)return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    } 
}