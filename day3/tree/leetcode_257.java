class Solution {
    void path(TreeNode root,List<String> str,String curr)
    {
        if(root==null) return;
        if(root.left==null&&root.right==null)
        {
            curr=curr+Integer.toString(root.val);
            str.add(curr);
            return;
        }
        else
        {
            curr=curr+Integer.toString(root.val)+"->";
        }
        path(root.left,str,curr);
        path(root.right,str,curr);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr=new ArrayList<>();
        path(root,arr,"");
        return arr;
        
    }
}