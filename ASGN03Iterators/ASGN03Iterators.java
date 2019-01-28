import java.util.*;

public class ASGN03Iterators
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();

		boolean more = true;
		while(more)
		{
			System.out.println("   1: IsEmpty");
			System.out.println("   2: IsSorted");
			System.out.println("   3: InsertAtHead");
			System.out.println("   4: InsertAtTail");
			System.out.println("   5: InsertAtIndex");
			System.out.println("   6: InsertInOrder");
			System.out.println("   7: ChangeAtIndex");
			System.out.println("   8: RemoveFromHead");
			System.out.println("   9: RemoveFromTail");
			System.out.println("  10: RemoveFromIndex");
			System.out.println("  11: RemoveFirstMatch");
			System.out.println("  12: GetHead");
			System.out.println("  13: GetTail");
			System.out.println("  14: Print");
			System.out.println("  15: PrintIndexed");
			System.out.println("  16: PrintReverse");
			System.out.println("  17: Quit");

			int choice = scan.nextInt();

			System.out.println();
			System.out.println();

			switch(choice)
			{
				case 1: //IsEmpty
				{
					System.out.println("IsEmpty");
					System.out.println();

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

				case 2: //IsSorted
				{
					System.out.println("IsSorted");
					System.out.println();

					if(isSorted(list))
					{
						System.out.println("TRUE");
					}
					else
					{
						System.out.println("FALSE");
					}

					break;
				}

				case 3: //addFirst
				{
					System.out.println("addFirst");
					System.out.println();

					System.out.print("Value: ");
					list.addFirst(scan.nextInt());

					break;
				}

				case 4: //addLast
				{
					System.out.println("addLast");
					System.out.println();

					System.out.print("Value: ");
					list.addLast(scan.nextInt());

					break;
				}

				case 5: //insertAtIndex
				{
					System.out.println("insertAtIndex");
					System.out.println();

					System.out.print("Index: ");
					int index = scan.nextInt();

					if(index > list.size() || index < 0)
					{
						System.out.println("ERROR: INDEX OUT OF BOUNDS");
					}
					else
					{
						System.out.print("Value: ");
						list.add(index, scan.nextInt());
					}

					break;
				}

				case 6: //insertInOrder
				{
					System.out.println("insertInOrder");
					System.out.println();

					System.out.print("Value: ");
					insertInOrder(list, scan.nextInt());

					break;
				}

				case 7: //changeAtIndex
				{
					System.out.println("changeAtIndex");
					System.out.println();

					System.out.print("Index: ");
					int index = scan.nextInt();

					if(index < 0 || index >= list.size())
					{
						System.out.println("ERROR: INDEX OUT OF BOUNDS");
					}
					else
					{
						System.out.print("Value: ");
						list.set(index, scan.nextInt());
					}

					break;
				}

				case 8: //removeFromHead
				{
					System.out.println("removeFromHead");
					System.out.println();

					if(list.isEmpty())
					{
						System.out.println("ERROR: EMPTY LisT");
					}
					else
					{
						System.out.println(list.getFirst());
						list.removeFirst();
					}

					break;
				}

				case 9: //removeFromTail
				{
					System.out.println("removeFromTail");
					System.out.println();

					if(list.isEmpty())
					{
						System.out.println("ERROR: EMPTY LisT");
					}
					else
					{
						System.out.println(list.getLast());
						list.removeLast();
					}

					break;
				}

				case 10: //removeFromIndex
				{
					System.out.println("removeFromIndex");
					System.out.println();

					System.out.print("Index: ");
					int index = scan.nextInt();

					if(index < 0 || index >= list.size())
					{
						System.out.println("ERROR: INDEX OUT OF BOUNDS");
					}
					else
					{
						System.out.println("Integer Removed :" + list.get(index));
						list.remove(index);
					}

					break;
				}

				case 11: //removeFirstMatch
				{
					System.out.println("removeFirstMatch");
					System.out.println();

					System.out.print("Value: ");
					boolean match = removeFirstMatch(list, scan.nextInt());

					if(!match)
					{
						System.out.println("ERROR: NO MATCH");
					}

					break;
				}

				case 12: //getHead
				{
					System.out.println("getHead");
					System.out.println();

					if(list.isEmpty())
					{
						System.out.println("ERROR: EMPTY LIST");
					}
					else
					{
						System.out.println(list.getFirst());
					}

					break;
				}

				case 13: //getTail
				{
					System.out.println("getTail");
					System.out.println();

					if(list.isEmpty())
					{
						System.out.println("ERROR: EMPTY LIST");
					}
					else
					{
						System.out.println(list.getLast());
					}

					break;
				}

				case 14: //print
				{
					System.out.println("print");
					System.out.println();

					traverse(list);

					break;
				}

				case 15: //printIndexed
				{
					System.out.println("printIndexed");
					System.out.println();

					traverseIndexed(list);

					break;
				}

				case 16: //printReverse
				{
					System.out.println("printReverse");
					System.out.println();

					traverseReverse(list);

					break;
				}

				case 17: //quit
				{
					System.out.println("quit");
					System.out.println();

					more = false;

					break;
				}

				default:
				{
					System.out.println("INPUT ERROR; TRY AGAIN!");
					System.out.println();

					break;
				}
			}

			System.out.println("-----------------------------------------------");

		}
	}

	public static void insertInOrder(LinkedList<Integer> list, int value)
	{
		ListIterator<Integer> iter = list.listIterator();
		boolean condition = false;

		if(list.isEmpty())
		{
			iter.add(value);
		}
		else
		{
			while(iter.hasNext())
			{
				if(value <= iter.next())
				{
					iter.previous();
					iter.add(value);
					condition = true;
					break;
				}
			}

			if(!iter.hasNext() && condition == false)
			{
				iter.add(value);
			}
		}
	}

	public static boolean removeFirstMatch(LinkedList<Integer> list, int value)
	{
		ListIterator<Integer> iter = list.listIterator();

		while(iter.hasNext())
		{
			if(value == (int) iter.next())
			{
				iter.previous();
				iter.remove();
				return true;
			}
		}

		return false;
	}

	public static boolean isSorted(LinkedList<Integer> list)
	{
		Iterator<Integer> iter = list.iterator();

		if(!iter.hasNext())
		{
			return true;
		}

		int current = iter.next();

		while(iter.hasNext())
		{
			int next = iter.next();
			if(current > next)
			{
				return false;
			}
		}
		return true;
	}

	public static void traverse(LinkedList<Integer> list)
	{
		Iterator<Integer> iter = list.iterator();

		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

	public static void traverseIndexed(LinkedList<Integer> list)
	{
		for(int i : list)
		{
			System.out.println(i);
		}
	}

	public static void traverseReverse(LinkedList<Integer> list)
	{
		ListIterator<Integer> iter = list.listIterator(list.size());

		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}

	}
}