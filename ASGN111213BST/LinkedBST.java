public class LinkedBST implements BST
{
	private Node root;

	public LinkedBST() {root = null;}

	public void insert (int v)
	{
		Node node = root;

		if(node == null)
		{
			root = new Node(v);
		}

		else
		{
			while(node.getLeft() != null || node.getRight() != null)
			{
				if(v <= node.getValue())
				{
					if(node.getLeft() == null)
					{
						break;
					}

					node = node.getLeft();
				}

				else
				{
					if(node.getRight() == null)
					{
						break;
					}

					node = node.getRight();
				}
			}

			if(v <= node.getValue())
			{
				node.setLeft(new Node (v));
			}

			else
			{
				node.setRight(new Node (v));
			}
		}
	}

	public boolean search(int v)
	{
		Node node = root;

		while(node != null)
		{
			if(v > node.getValue())
			{
				node = node.getRight();
			}

			else if(v < node.getValue())
			{
				node = node.getLeft();
			}

			else if(v == node.getValue())
			{
				return true;
			}
		}
		return false;
	}

	public void preorder()
	{
		if(root == null)
		{
			System.out.println("ERROR: NO VALUES");
		}
		else
		{
			preorder(root);
			System.out.println();
		}
	}

	public void inorder()
	{
		if(root == null)
		{
			System.out.println("ERROR: NO VALUES");
		}
		else
		{
			inorder(root);
			System.out.println();
		}
	}

	public void postorder()
	{
		if(root == null)
		{
			System.out.println("ERROR: NO VALUES");
		}
		else
		{
			postorder(root);
			System.out.println();
		}
	}

	public void levelorder()
	{
		if(root != null)
		{
			/*
			Queue queue = new Queue();
			queue.enqueue(root);

			while(!queue.isEmpty())
			{
				QueueNode qnode = new QueueNode(queue.dequeue());

				System.out.print(qnode.getNode().getValue() + " ");

				if(qnode.getNode().getLeft() != null)
				{
					queue.enqueue(qnode.getNode().getLeft());
				}

				if(qnode.getNode().getRight() != null)
				{
					queue.enqueue(qnode.getNode().getRight());
				}
			}
			*/

			Queue queue = new Queue();
			queue.enqueue(root);

			while(!queue.isEmpty())
			{
				Node temp = queue.dequeue();

				System.out.print(temp.getValue() + " ");

				if(temp.getLeft() != null)
				{
					queue.enqueue(temp.getLeft());
				}

				if(temp.getRight() != null)
				{
					queue.enqueue(temp.getRight());
				}
			}

			System.out.println();
		}
		else
		{
			System.out.println("ERROR: NO VALUES");
		}
	}

	private void preorder(Node node)
	{
		System.out.print(node.getValue() + " ");
		if(node.getLeft() != null) preorder(node.getLeft());
		if(node.getRight() != null) preorder(node.getRight());
	}
	// print node value, traverse left, traverse right


	private void inorder(Node node)
	{
		if(node.getLeft() != null) inorder(node.getLeft());
		System.out.print(node.getValue() + " ");
		if(node.getRight() != null) inorder(node.getRight());
	}
	// traverse left, print node value, traverse right

	private void postorder(Node node)
	{
		if(node.getLeft() != null) postorder(node.getLeft());
		if(node.getRight() != null) postorder(node.getRight());
		System.out.print(node.getValue() + " ");
	}
	// traverse left, traverse right, print node value
}