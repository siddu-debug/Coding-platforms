/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid){
        int n=grid.length;
        return divide(grid,0,0,n);
    }
    public Node divide(int[][] grid,int row, int col, int n){
        boolean flag=true;
        for(int i=row;i<row+n;i++){
            for(int j=col;j<col+n;j++){
                if(grid[i][j] != grid[row][col]){
                    flag=false;
                }
                if(flag==false){
                    break;
                }
            }
                if(flag==false){
                    break;

            }
        }
        if(flag == true){
            return new Node(grid[row][col]==1,flag);
        }
        int dim=n/2;
        Node topleft=divide(grid, row, col, dim);
        Node topright=divide(grid, row, col+dim, dim);
        Node bottomleft=divide(grid, row+dim, col, dim);
        Node bottomright=divide(grid, row+dim, col+dim, dim);
        return new Node(false, false, topleft, topright, bottomleft, bottomright);
    }
        
    }
