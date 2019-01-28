import java.util.*;

public class ASGN01ArrayList
{
	private static Scanner scan;

	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		ArrayList<String> myArrayList = new ArrayList<String>();

		boolean more = true;
		while(more)
		{
			System.out.println("Please make a selection from the following:");
			System.out.println("  1: InsertInOrder");
			System.out.println("  2: RemoveFirstMatch");
			System.out.println("  3: Swap");
			System.out.println("  4: IsSorted");
			System.out.println("  5: Print");
			System.out.println("  6: Quit");
			int choice = scan.nextInt();
			System.out.println();

			if(choice == (1))
			{
				System.out.print("Input a String: ");
				String n = scan.next();
				int s = myArrayList.size();

				if(myArrayList.isEmpty())
				{
					myArrayList.add(n);
				}

				for(int i = 0; i < s; i++)
				{
					if(n.compareTo(myArrayList.get(s - 1)) >= 0)
					{
						myArrayList.add(n);
						break;
					}

					else if(n.compareTo(myArrayList.get(i)) < 0)
					{
						myArrayList.add(i, n);
						break;
					}
				}
			}

			else if(choice == (2))
			{
				System.out.print("Input search string: ");
				String comp = scan.next();

				boolean cond = false;

				for(int i = 0 ; i < myArrayList.size() ; i++)
				{
					String n = myArrayList.get(i);

					if (n.equals(comp))
					{
						myArrayList.remove(i);
						cond = true;
						break;
					}
				}

				if(!cond)
				{
					System.out.println("NoMatch");
				}
			}

			else if(choice == (3))
			{
				System.out.print("Index 1: ");
				int A = scan.nextInt();
				System.out.print("Index 2: ");
				int B = scan.nextInt();

				String temp = myArrayList.get(A);
				myArrayList.set(A, myArrayList.get(B));
				myArrayList.set(B, temp);
			}

			else if(choice == (4))
			{
				boolean cond = true;

				if (myArrayList.size() > 1)
				{
					for (int i = 0 ; i < myArrayList.size(); i++)
					{
						try
						{
							if ((myArrayList.get(i)).compareTo(myArrayList.get(i + 1)) > 0)
							{
								cond = false;
							}

						}
						catch (Exception e) {}
					}
				}

				System.out.println(cond);
			}

			else if(choice == (5))
			{
				System.out.println("Number of Strings:" + myArrayList.size());

				for (String i : myArrayList)
				{
					System.out.println(i);
				}
			}

			else if(choice == (6))
			{
				more = false;
			}

			else
			{
				System.out.println("INPUT ERROR; TRY AGAIN!");
			}

			System.out.println();
			System.out.println();
		}
	}
}