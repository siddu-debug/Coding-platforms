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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> left=new LinkedList<>();
        Queue<TreeNode> right=new LinkedList<>();

        left.add(root.left);
        right.add(root.right);

        while(!left.isEmpty() && !right.isEmpty()){
            TreeNode leftnode =left.poll();
            TreeNode rightnode=right.poll();

            if(leftnode == null && rightnode == null){
                continue;
            }
            if(leftnode == null || rightnode==null || leftnode.val != rightnode.val){
                return false;

            }
            left.add(leftnode.left);
            left.add(leftnode.right);
            right.add(rightnode.right);
            right.add(rightnode.left);
        
        }

        return true;
    }
}