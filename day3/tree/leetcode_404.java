class Solution {
    int sum(TreeNode root,TreeNode sub)
    {
        if(sub==null) return 0;
        if(sub.left==null&&sub.right==null)
        {
            if(root.left==sub) return sub.val;
            else return 0;
        }
        int sum1=sum(sub,sub.left);
        int sum2=sum(sub,sub.right);
        return sum1+sum2;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null&&root.right==null) return 0;
        return sum(null,root);
        
    }
}