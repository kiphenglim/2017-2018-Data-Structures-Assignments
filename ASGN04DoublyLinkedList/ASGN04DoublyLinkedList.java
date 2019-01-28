import java.util.*;

public class ASGN04DoublyLinkedList
{

	public static void main(String args[])
	{
		DoublyLinkedList list = new DoublyLinkedList();
		boolean more = true;

		while(prompt(more, list, menu()))
		{
			System.out.println();
			System.out.println("__________________________________________________");
		}
	}

	public static int menu()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println(" Make a selection:");
		System.out.println("  1:  isEmpty");
		System.out.println("  2:  sorted");
		System.out.println("  3:  insertHead");
		System.out.println("  4:  insertTail");
		System.out.println("  5:  insertInOrder");
		System.out.println("  6:  removeFirstMatch");
		System.out.println("  7:  print");
		System.out.println("  8:  printBackwards");
		System.out.println("  9:  size");
		System.out.println("  10: quit");
		System.out.println();
		System.out.print(" Choice: ");
		int option = scan.nextInt();
		System.out.println();
		return option;
	}

	public static boolean prompt(boolean more, DoublyLinkedList list, int option)
	{
		Scanner scan = new Scanner (System.in);
		switch(option)
		{
			case 1:
			{
				System.out.println("isEmpty");
				if(list.isEmpty())
				{
					System.out.println("TRUE");
				}
				else
				{
					System.out.println("FALSE");
				}
				break;
			}
			case 2:
			{
				System.out.println("isSorted");
				if(list.isSorted())
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
				System.out.println("insertHead");
				System.out.print("value: ");
				list.insertHead(scan.nextInt());
				break;
			}
			case 4:
			{
				System.out.println("insertTail");
				System.out.print("value: ");
				list.insertTail(scan.nextInt());
				break;
			}
			case 5:
			{
				System.out.println("insertInOrder");
				System.out.print("value: ");
				list.insertInOrder(scan.nextInt());
				break;
			}
			case 6:
			{
				System.out.println("removeFirstMatch");
				System.out.print("value: ");
				if(!list.removeFirstMatch(scan.nextInt()))
				{
					System.out.println("ERROR: NO MATCH");
				}
				break;
			}
			case 7:
			{
				System.out.println("print");
				list.print();
				break;
			}
			case 8:
			{
				System.out.println("printBackwards");
				list.printBackwards();
				break;
			}
			case 9:
			{
				System.out.println(list.size());
				break;
			}
			case 10:
			{
				more = false;
				break;
			}
			default:
			{
				System.out.println("ERROR: INPUT");
				break;
			}
		}

		return more;
	}

}