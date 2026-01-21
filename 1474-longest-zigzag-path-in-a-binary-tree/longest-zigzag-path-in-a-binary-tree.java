class Solution {

    int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        dfs(root.left, 0, 1);   // 0 = left
        dfs(root.right, 1, 1);  // 1 = right

        return max;
    }

    public void dfs(TreeNode node, int dir, int length) {
        if (node == null) return;

        max = Math.max(max, length);

        if (dir == 0) { // last move was LEFT
            dfs(node.right, 1, length + 1); // zigzag continues
            dfs(node.left, 0, 1);           // restart
        } else { // last move was RIGHT
            dfs(node.left, 0, length + 1);  // zigzag continues
            dfs(node.right, 1, 1);          // restart
        }
    }
}
