class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited=new HashSet<>();
        int prov=0;

        for(int i=0;i<isConnected.length;i++){
            if(!visited.contains(i)){
                prov++;
                dfs(isConnected, i, visited);
            }
        }
        return prov;
    }
    public void dfs(int[][] isConnected,int idx,Set<Integer> visited){
        visited.add(idx);
        for(int i=0;i<isConnected[idx].length; i++){
            if(isConnected[idx][i] == 1 && !visited.contains(i)){
                dfs(isConnected, i, visited);
            }  
        } 
    }
}