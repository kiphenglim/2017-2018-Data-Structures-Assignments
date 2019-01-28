import java.util.*;

public class ASGN02LinkedList
{
	private static Scanner scan;

	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		MyList list = new MyList();

		int value;
		boolean more = true;

		while(more)
		{
			System.out.println("Please make a selection from the following:");
			System.out.println("  1: InsertAtHead");
			System.out.println("  2: InsertAtTail");
			System.out.println("  3: InsertInOrder");
			System.out.println("  4: RemoveFirstMatch");
			System.out.println("  5: IsSorted");
			System.out.println("  6: Print");
			System.out.println("  7: IsEmpty");
			System.out.println("  8: Size");
			System.out.println("  9: Quit");
			int choice = scan.nextInt();
			System.out.println();

			switch (choice)
			{
				case 1:
				{
					System.out.println("InsertAtHead");
					System.out.print("Enter an Integer value to insert: ");
					value = scan.nextInt();
					list.insertAtHead((Integer)value);
					break;
				}

				case 2:
				{
					System.out.println("InsertAtTail");
					System.out.print("Enter an Integer value to insert: ");
					value = scan.nextInt();
					list.insertAtTail((Integer)value);
					break;
				}

				case 3:
				{
					System.out.println("InsertInOrder");
					System.out.print("Enter an Integer value to insert: ");
					value = scan.nextInt();
					list.insertInOrder((Integer)value);
					break;
				}

				case 4:
				{
					System.out.println("RemoveFirstMatch");
					System.out.print("Enter an Integer value to remove: ");
					value = scan.nextInt();
					if(!list.removeFirstMatch((Integer)value)) // just remove it if found
					{
						System.out.println("NO MATCH");
					}
					break;
				}

				case 5:
				{
					System.out.println("IsSorted");
					if(list.isSorted())
					{
						System.out.println("YES");
					}
					else
					{
						System.out.println("NO");
					}
					break;
				}

				case 6:
				{
					System.out.println("Print");
					list.print();
					System.out.println();
					break;
				}

				case 7:
				{
					System.out.println("IsEmpty");
					if(list.isEmpty())
					{
						System.out.println("EMPTY");
					}
					else
					{
						System.out.println("NOT EMPTY");
					}
					break;
				}

				case 8:
				{
					System.out.println("Size");
					System.out.println(list.size());
					break;
				}

				case 9:
				{
					System.out.println("Quit");
					more = false;
					break;
				}

				default:
				{
					System.out.println("INPUT ERROR; TRY AGAIN!");
					break;
				}
			}

			System.out.println();
		}
	}
}