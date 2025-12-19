class Solution {
    boolean func_call(int[][] edges,int source,int destination,boolean[] visited,List<List<Integer>> a,int curr)
    {
        //System.out.println(curr);
        if(curr==destination) return true;
        boolean ret_val=false;
        for(int num:a.get(curr))
        {
            if(visited[num]!=true)
            {
                visited[num]=true;
                ret_val=func_call(edges,source,destination,visited,a,num);
                if(ret_val==true) return true;
            }
        }
        return ret_val;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==0&&destination==0) return true;
        Arrays.sort(edges, (a, b) -> a[0] - b[0]);
        //System.out.print(edges[0][0]);
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            a.add(new ArrayList<>());
        }
      for(int[] arr:edges)
      {
        a.get(arr[0]).add(arr[1]);
        a.get(arr[1]).add(arr[0]);
      }
      boolean[] visited=new boolean[n+1];
      visited[source]=true;
      return func_call(edges,source,destination,visited,a,source);
    }
}
