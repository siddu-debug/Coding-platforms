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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> path= new LinkedList<>();
        Queue<Integer> sum= new LinkedList<>();
        if(root == null){
            return false;
        }

        path.add(root);
        sum.add(root.val);

        while(!path.isEmpty()){
            TreeNode node=path.poll();
            int nodesum=sum.poll();
            if(nodesum ==targetSum && node.left == null && node.right ==null){
                return true;
            }
            if(node.left != null){
                path.add(node.left);
                sum.add(node.left.val + nodesum);
            }
            if(node.right != null){
                path.add(node.right);
                sum.add(node.right.val + nodesum);
            }

        }
        return false;
        
        
    }
}