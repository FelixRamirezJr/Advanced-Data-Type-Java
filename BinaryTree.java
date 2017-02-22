public class BinaryTree{

	Node root;

	public void addNode(int key,String name)
	{
		Node newNode = new Node(key,name);

		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node focusNode = root;

			Node parent;

			while(true)
			{
				parent = focusNode;
				if(key < parent.key)
				{
					focusNode = focusNode.left;
					if(focusNode == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else
				{
					focusNode = focusNode.right;
					if(focusNode == null)
					{
						parent.right = newNode;
						return;
					}
				}

			}
		}
	}

	public void inOrderTraverse(Node focusNode)
	{
		if(focusNode != null)
		{
			inOrderTraverse(focusNode.left);
			System.out.println(focusNode.toString());
			inOrderTraverse(focusNode.right);
		}
	}

	public void preOrderTraverse(Node focusNode)
	{
		if(focusNode != null)
		{
			System.out.println(focusNode.toString());
			preOrderTraverse(focusNode.left);
			preOrderTraverse(focusNode.right);
		}
	}

	public void postOrderTraveral(Node focusNode)
	{
		if(focusNode != null)
		{
			preOrderTraverse(focusNode.left);
			preOrderTraverse(focusNode.right);
			System.out.println(focusNode.toString());;
		}
	}

	public static void main(String [] args){
		BinaryTree bt = new BinaryTree();
		bt.addNode(30,"Boss");
		bt.addNode(40,"Vice Pres");
		bt.addNode(31,"OfficeMan");
		bt.addNode(1,"Spiderman");
		bt.addNode(2,"Wolverine");
		bt.inOrderTraverse(bt.root);
		System.out.println("Pre order traversal");
		bt.preOrderTraverse(bt.root);
		System.out.println("Post order traversal");
		bt.postOrderTraveral(bt.root);

	}
}

class Node{
	int key;
	Node left;
	Node right;
	String name;

	Node(int key, String n)
	{
		this.key = key;
		this.name = n;
	}

	public String toString()
	{
		return "Key: " + key + " name: " + name;
	}
}