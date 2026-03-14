class Solution {
    void process(int[] leader,int par1,int par2)
    {
        int min=Math.min(par1,par2);
        int max=Math.max(par1,par2);
        for(int i=1;i<leader.length;i++)
        {
            if(leader[i]==max)
            {
                leader[i]=min;
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int[] leader=new int[edges.length+1];
        int[] ans=new int[2];
        for(int i=1;i<leader.length;i++)
        {
            leader[i]=i;
        }
        for(int i=0;i<leader.length;i++)
        {
            System.out.println(leader[i]);
        }
        for(int i=0;i<edges.length;i++)
        {
            int vert1=edges[i][0];
            int vert2=edges[i][1];
            if(leader[vert1]!=leader[vert2])
            {
                process(leader,leader[vert1],leader[vert2]);
            }
            else
            {
                //System.out.println(leader[vert1]+" "+leader[vert2]+" "+vert1+" "+vert2);
                ans[0]=vert1;
                ans[1]=vert2;
            }
        }
        return ans;
    }
}
