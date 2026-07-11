import java.util.ArrayList;
import java.util.List;
class Solution {
    private int vertexCount;
    private int degreeSum;
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int completeComponentsCount = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                vertexCount = 0;
                degreeSum = 0;
                dfs(i, adj, visited);
                if (degreeSum == vertexCount * (vertexCount - 1)) {
                    completeComponentsCount++;
                }
            }
        }
        return completeComponentsCount;
    }
    private void dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        vertexCount++;
        degreeSum += adj.get(u).size();
        for (int neighbor : adj.get(u)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}