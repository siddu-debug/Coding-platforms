class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        while(!stack.isEmpty()){
            int ul=stack.pop();
            visited[ul]=true;
            for(int key:rooms.get(ul)){
                if(!visited[key]){
                    stack.push(key);
                }
            }
        }
        for(int i = 0; i < rooms.size();i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}