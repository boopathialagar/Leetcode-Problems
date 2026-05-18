class Solution {
    long fuel =0;
    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = roads.length+1;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] road:roads){
            int u=road[0];
            int v=road[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(0,-1,seats,adj);
        return fuel;
    }

int dfs(int node,int parent,int seats,List<List<Integer>> adj){
        int people =1;
        for(int nei:adj.get(node)){
            if(parent == nei)continue;
            int child = dfs(nei,node,seats,adj);
            fuel += (child+seats-1)/seats;
            people+=child;
        }
        return people;
    }

}