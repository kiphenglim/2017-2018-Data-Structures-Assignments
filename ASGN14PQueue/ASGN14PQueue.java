import java.util.*;

public class ASGN14PQueue
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Heap heap = new Heap();
		boolean more = true;

		while(more)
		{
			System.out.println("STARTING PRIORITY QUEUE...");
			System.out.print("CHANGE DEFAULT CAPACITY? (Y/N) ");
			String option = scan.next();
			option = option.toUpperCase();

			switch(option)
			{
				case "Y":
				{
					System.out.print("Enter the heap capacity: ");
					int capacity = scan.nextInt();
					heap = new Heap(capacity);
					more = false;
					break;
				}
				case "N":
				{
					more = false;
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR");
					break;
				}
			}

			System.out.println();
			System.out.println();
		}

		more = true;

		while(more)
		{
			System.out.println("1: INSERT");
			System.out.println("2: REMOVE");
			System.out.println("3: SIZE");
			System.out.println("4: PRINT");
			System.out.println("5: QUIT");
			System.out.println();
			System.out.print("CHOICE: ");
			int choice = scan.nextInt();
			System.out.println();

			switch(choice)
			{
				case 1:
				{
					System.out.print("INSERT POSITIVE INTEGER PRIORITY: ");
					int priority = scan.nextInt();

					if(heap.insert(priority))
					{
						System.out.println(priority + " INSERT SUCCESSFUL");
					}

					else
					{
						System.out.println(priority + " INSERT UNSUCCESSFUL");
					}

					break;
				}

				case 2:
				{
					int top = heap.remove();

					if(top > 0)
					{
						System.out.println(top + " REMOVED");
					}

					else
					{
						System.out.println("EMPTY HEAP");
					}

					break;
				}

				case 3:
				{
					System.out.println("SIZE: " + heap.size());
					break;
				}

				case 4:
				{
					heap.print();
					break;
				}

				case 5:
				{
					more = false;
					break;
				}

				default:
				{
					System.out.println("INPUT ERROR");
					break;
				}
			}

			System.out.println();
		}
	}
}