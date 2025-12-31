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
        Queue<TreeNode> ptqueue=new LinkedList<>();
        Queue<TreeNode> qtqueue=new LinkedList<>();

        ptqueue.add(p);
        qtqueue.add(q);

        while(!ptqueue.isEmpty() && !qtqueue.isEmpty()){
            TreeNode pnode=ptqueue.poll();
            TreeNode qnode=qtqueue.poll();

            if(pnode == null && qnode == null){
                continue;
            }
            if(pnode == null || qnode == null || pnode.val != qnode.val){
                return false;
            }
            ptqueue.add(pnode.left);
            ptqueue.add(pnode.right);
            qtqueue.add(qnode.left);
            qtqueue.add(qnode.right);
        }
        return true;


        
    }
}