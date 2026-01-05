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
    public int sumNumbers(TreeNode root) {
    Queue<TreeNode> path=new LinkedList<>();
    Queue<Integer> num=new LinkedList<>();
    int tot=0;
    if(root==null){
        return 0;
    }

    path.add(root);
    num.add(root.val);
    
    while(!path.isEmpty()){
        TreeNode node=path.poll();
        int nodenum=num.poll();
        if(node.left==null && node.right==null){
            tot += nodenum;
        }

        if(node.left != null){
            path.add(node.left);
            num.add(nodenum * 10 + node.left.val);
        }
        
        if(node.right != null){
            path.add(node.right);
            num.add(nodenum * 10 + node.right.val);
        }

    }
    return tot;

        
    }
}