class Solution {
    void func(int[][] graph,List<List<Integer>> res,List<Integer> path,int num)
    {
        System.out.println(num);
        if(num==graph.length-1)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int col=0;col<graph[num].length;col++)
        {
            path.add(graph[num][col]);
            func(graph,res,path,graph[num][col]);
            path.remove(path.size()-1);           
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        func(graph,res,path,0);
        return res;
    }
}
