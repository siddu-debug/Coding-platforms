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
    public int diameterOfBinaryTree(TreeNode root) {

        Stack<TreeNode> stack=new Stack<>();
        Map<TreeNode, Integer> map=new HashMap<>();
        if(root==null){
            return 0;
        }

        int dia=0;
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.peek();

            if(node.left != null && !map.containsKey(node.left)){
                stack.push(node.left);
            }
            else if(node.right != null  && !map.containsKey(node.right)){
                stack.push(node.right);
            }
            else{
                TreeNode curr=stack.pop();
                int leftdia=map.getOrDefault(node.left, 0);
                int rightdia=map.getOrDefault(node.right, 0);
                map.put(node, 1+Math.max(leftdia,rightdia));
                dia=Math.max(dia, leftdia + rightdia);
            }
            }
            return dia;
        }        
    }
