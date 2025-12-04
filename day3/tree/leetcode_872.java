class Solution {
    void func1(TreeNode root1,List<Integer> arr)
    {
        if(root1==null) return;
        if(root1.left==null&&root1.right==null)
        {
            arr.add(root1.val);
            return;
        }
        func1(root1.left,arr);
        func1(root1.right,arr);
    }
    // void func2(TreeNode root2,List<Integer> arr)
    // {
    //     if(root2==null) return;
    //     if(root2.left==null&&root2.right==null)
    //     {
    //         arr.add(root2.val);
    //         return;
    //     }
    //     func2(root2.left,arr);
    //     func2(root2.right,arr);
    // }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        func1(root1,arr1);
        func1(root2,arr2);
        if(arr1.size()!=arr2.size()) return false;
        for(int i=0;i<arr1.size();i++)
        {
            System.out.println(arr1.get(i)+" "+arr2.get(i));
            if(!arr1.get(i).equals(arr2.get(i)) )
            {
                System.out.print(arr1.get(i)+" "+arr2.get(i));
                return false;
            }
        }
        return true;
    }

}