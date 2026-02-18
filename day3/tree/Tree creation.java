import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
        left=null;
        right=null;
    }
}
class BinaryTree
{
    private Node root;
    public Node buildTree(int[] arr)
    {
        if(arr.length==0) return null;
        Node newNode=new Node(arr[0]);
        root=newNode;
        Queue<Node> q=new LinkedList<>();
        q.add(newNode);
        int i=1;
        while(!q.isEmpty()&&i<arr.length)
        {
            Node temp=q.poll();
            temp.left=new Node(arr[i++]);
            q.add(temp.left);
            if(i<arr.length)
            {
                temp.right=new Node(arr[i++]);
                q.add(temp.right);
            }
        }
        return root;
    }
    public void display()
    {
        if(root==null)
        {
            System.out.print("No tree is created till now");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        System.out.print(root.val+" ");
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp.left!=null)
            {
                System.out.print(temp.left.val+" ");
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                System.out.print(temp.right.val+" ");
                q.add(temp.right);
            }
        }
    }
    public void preorder(Node root)
    {
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    public void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        BinaryTree bt=new BinaryTree();
        Node root=bt.buildTree(arr);
        bt.display();
        System.out.print("\nPre order traversal is:");
        bt.preorder(root);
        System.out.print("\nPost order traversal is:");
        bt.postorder(root);
        System.out.print("\nIn order traversal is:");
        bt.inorder(root);
    }
}
