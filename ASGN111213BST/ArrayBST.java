public class ArrayBST implements BST // the only class needed for array BST
{
	private int [] bst;
	private boolean hasValue[];
	private final int max = 100;

	public ArrayBST()
	{
		bst = new int [max + 1];
		hasValue = new boolean[max + 1];

		for(int i = 0; i <= max; i++)
		{
			hasValue[i] = false;
		}
	}

	public void insert(int v)
	{
		if(hasValue[1] == false)
		{
			bst[1] = v;
			hasValue[1] = true;
		}

		else
		{
			int i = 1;

			while(hasValue[i] == true)
			{
				if(v <= bst[i])
				{
					i = 2*i;
				}

				else
				{
					i = 2*i+1;
				}
			}

			bst[i] = v;
			hasValue[i] = true;
		}
	}

	public boolean search(int v)
	{
		int i = 1;

		while(hasValue[i] == true)
		{
			if(v < bst[i])
			{
				i = 2*i;
			}

			else if (v > bst[i])
			{
				i = 2*i+1;
			}

			else
			{
				return true;
			}
		}

		return false;
	}

	public void preorder()
	{
		if(hasValue[1] == false)
		{
			System.out.println("ERROR: NO VALUES");
		}

		else
		{
			preorder(1);
			System.out.println();
		}
	}

	public void inorder()
	{
		if(hasValue[1] == false)
		{
			System.out.println("ERROR: NO VALUES");
		}
		else
		{
			inorder(1);
			System.out.println();
		}
	}

	public void postorder()
	{
		if(hasValue[1] == false)
		{
			System.out.println("ERROR: NO VALUES");
		}
		else
		{
			postorder(1);
			System.out.println();
		}
	}

	public void levelorder()
	{
		if(hasValue[1] == false)
		{
			System.out.println("ERROR: NO VALUES");
		}

		else
		{
			int level = 1;

			for(int i = 1; i <= 100; i++)
			{
				if(hasValue[i] == true)
					System.out.print(bst[i] + " ");
			}

			System.out.println();
		}
	}

	private void preorder(int pos)
	{
		System.out.print(bst[pos] + " ");

		if (hasValue[2 * pos] == true)
		{
			preorder(2 * pos);
		}

		if (hasValue[2 * pos + 1] == true)
		{
			preorder (2 * pos + 1);
		}
	}

	private void inorder(int pos)
	{
		if (hasValue[2 * pos] == true)
		{
			inorder(2 * pos);
		}

		System.out.print(bst[pos] + " ");

		if (hasValue[2 * pos + 1] == true)
		{
			inorder(2 * pos + 1);
		}
	}

	private void postorder(int pos)
	{
		if (hasValue[2 * pos] == true)
		{
			postorder(2 * pos);
		}

		if (hasValue[2 * pos + 1] == true)
		{
			postorder(2 * pos + 1);
		}

		System.out.print(bst[pos] + " ");
	}
}