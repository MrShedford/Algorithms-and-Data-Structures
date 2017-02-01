package bTCode;
import java.util.Scanner;
/*This is all the boiler plate code we need for Binary Trees in CS211
 * 1-2-2017
 * uploaded by: Seán Comerford
 */
class Node
{    
    Node left, right;
    int data;

    public Node()
    {
        left = null;
        right = null;
        data = 0;
    }
    //GC
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
   //set left node
    public void setLeft(Node n)
    {
        left = n;
    }
    //set right node
    public void setRight(Node n)
    {
        right = n;
    }
    //return leftnode
    public Node getLeft()
    {
        return left;
    }
    //return right node
    public Node getRight()
    {
        return right;
    }
    //insert data into a node
    public void setData(int d)
    {
        data = d;
    }
    //return data from a node
    public int getData()
    {
        return data;
    }     
}

//Binary tree class
class BT
{
    private Node root;

    //GC
    public BT()
    {
        root = null;
    }
   //isEmpty
    public boolean isEmpty()
    {
        return root == null;
    }
    //insert data into tree
    public void insert(int data)
    {
        root = insert(root, data);
    }
    //Inserts data into a node through recursion
    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);             
        }
        return node;
    }     
    //counts the number of nodes
    public int countNodes()
    {
        return countNodes(root);
    }
   //counts the number of nodes recursively
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
   //finds a val
    public boolean find(int val)
    {
        return find(root, val);
    }
    //finds it recursively
    private boolean find(Node r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (find(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (find(r.getRight(), val))
                return true;
        return false;         
    }
    //inOrder traversal
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    //preOrder Traversal
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    //postOrder Traversal
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }     
}
//this is just an example to see if it works
public class bTClass{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BT tree = new BT();
		for(int i = 0; i <7;i++)
		{
			tree.insert(sc.nextInt());
		}
		
		System.out.println(tree.countNodes());
		
	}
}
