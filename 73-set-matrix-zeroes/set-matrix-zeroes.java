class Solution {
    public void setZeroes(int[][] matrix) { 

        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> rowidx=new HashSet<>();
        Set<Integer> colidx=new HashSet<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] ==0){
                    rowidx.add(i);
                    colidx.add(j);
                }
            }
        }
        for(int row:rowidx){
            for(int j=0;j<n;j++){
                matrix[row][j]=0;
            }
        }
        for(int col:colidx){
            for(int i=0;i<m;i++){
                matrix[i][col]=0;
            }
        }
        
    }
}