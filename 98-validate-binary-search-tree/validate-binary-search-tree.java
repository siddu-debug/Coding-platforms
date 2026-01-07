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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        traverse(root, inorder);

        for(int i=1;i<inorder.size();i++){
            if(inorder.get(i-1) >= inorder.get(i)){
            return false;
        }
    }
    return true;
}
    public void traverse(TreeNode root, List<Integer> inorder){
        if(root == null){
            return;
        }
        
        traverse(root.left,inorder);
        inorder.add(root.val);

        traverse(root.right, inorder);
        }
}