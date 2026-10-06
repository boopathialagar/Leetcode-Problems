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
        if(root == null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            Stack<Integer> s = new Stack<>();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.left != null)q.offer(cur.left);
                if(cur.right != null)q.offer(cur.right);
                if(!flag){
                    l.add(cur.val);
                }else{
                    s.add(cur.val);
                }
            }
            flag = !flag;
            while(!s.isEmpty()){
                l.add(s.pop());
            }
            result.add(l);
        }
        return result;
    }
}