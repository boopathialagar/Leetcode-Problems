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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            Stack<Integer> st = new Stack<>();
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode cur = q.poll();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);

                if(flag) {
                    st.push(cur.val);
                }
                else{
                    list.add(cur.val);
                }
            }
            flag = !flag;
            while(!st.isEmpty()){
                list.add(st.pop());
            }
            result.add(list);
        }
        return result;
    }
}