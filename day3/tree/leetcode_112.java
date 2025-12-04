class Solution {
    boolean path(TreeNode root,int sum,int target,TreeNode r)
    {
        if(root==null&&target==sum&&r.left==null&&r.right==null) return true;
        if(root==null&&(target!=sum||r.left!=null||r.right!=null)) return false;
        sum+=root.val;
        r=root;
        boolean b1=path(root.left,sum,target,r);
        boolean b2=path(root.right,sum,target,r);
        return b1||b2;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==targetSum) return true;
        return path(root,0,targetSum,null);
    }
}