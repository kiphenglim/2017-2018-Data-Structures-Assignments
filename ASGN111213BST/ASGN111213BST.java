import java.util.*;

public class ASGN111213BST
{

	public static void main(String args[])
	{
		BST bst = new ArrayBST();

		Scanner scan = new Scanner(System.in);

		boolean more = true;

		while(more)
		{
			System.out.println("BINARY SEARCH TREE...");
			System.out.println();
			System.out.println("1: ARRAYBST");
			System.out.println("2: LINKEDBST");
			System.out.println();
			System.out.print("CHOICE... ");

			switch (scan.nextInt())
			{
				case 1:
				{
					more = false;
					break;
				}
				case 2:
				{
					more = false;
					bst = new LinkedBST();
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR: SELECT 1 OR 2");
				}
			}

			System.out.println();
		}

		System.out.println("_______________________________________");
		System.out.println();

		more = true;

		while(more)
		{
			System.out.println("1: INSERT");
			System.out.println("2: SEARCH");
			System.out.println("3: PREORDER");
			System.out.println("4: INORDER");
			System.out.println("5: POSTORDER");
			System.out.println("6: LEVELORDER");
			System.out.println("7: QUIT");

			System.out.print("CHOICE... ");
			int option = scan.nextInt();
			System.out.println();

			switch(option)
			{
				case 1:
				{
					System.out.println("NEXT VALUE: ");
					bst.insert(scan.nextInt());
					break;
				}
				case 2:
				{
					System.out.println("SEARCH VALUE: ");
					if(bst.search(scan.nextInt()) == true)
					{
						System.out.println("TRUE");
					}
					else
					{
						System.out.println("FALSE");
					}
					break;
				}
				case 3:
				{
					bst.preorder();
					break;
				}
				case 4:
				{
					bst.inorder();
					break;
				}
				case 5:
				{
					bst.postorder();
					break;
				}
				case 6:
				{
					bst.levelorder();
					break;
				}
				case 7:
				{
					more = false;
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR: SELECT OPTIONS 1-7");
					break;
				}
			}

			System.out.println();
		}
	}
}