import java.util.*;
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> adj_list = new HashMap<>();
        for(int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];
            adj_list.putIfAbsent(u, new HashMap<>());
            adj_list.putIfAbsent(v, new HashMap<>());
            adj_list.get(u).put(v, val);
            adj_list.get(v).put(u, 1.0/val);
        }
        double[] res = new double[queries.size()];
        for(int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);
            Set<String> visited = new HashSet<>();
            res[i] = dfs(adj_list, src, dst, visited);
        }
        return res;
    }
    private double dfs(Map<String, Map<String, Double>> adj_list, String src, String dst, Set<String> visited) {
        if(!adj_list.containsKey(src) || !adj_list.containsKey(dst)) {
            return -1.0;
        }
        if(src.equals(dst)) {
            return 1.0;
        }
        visited.add(src);
        for(Map.Entry<String, Double> nei : adj_list.get(src).entrySet()) {
            String nxtNode =nei.getKey();
            if(!visited.contains(nxtNode)) {
                double temp = dfs(adj_list, nxtNode, dst, visited);
                if(temp != -1.0) {
                    return temp * nei.getValue();
                }
            }
        }
        return -1.0;
    }
}