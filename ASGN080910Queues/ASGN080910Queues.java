import java.util.*;

public class ASGN080910Queues
{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		MyQueue queue = new LinkedListQueue();

		boolean valid = false;
		int option;

		while(!valid)
		{
			System.out.println("1: ArrayQueue");
			System.out.println("2: LinkedListQueue");
			System.out.print("Choice: "); option = scan.nextInt();

			switch(option)
			{
				case 1:
				{
					System.out.println("ArrayQueue Minimum Size: ");
					queue = new ArrayQueue(scan.nextInt());
					valid = true;
					break;
				}
				case 2:
				{
					valid = true;
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR");
				}
			}
		}

		boolean more = true;

		while(more)
		{
			System.out.println("1: enqueue");
			System.out.println("2: dequeue");
			System.out.println("3: peek");
			System.out.println("4: empty");
			System.out.println("5: full");
			System.out.println("6: print");
			System.out.println("7: quit");
			System.out.println();
			System.out.print("Choice: ");
			option = scan.nextInt();
			System.out.println();

			switch(option)
			{
				case 1:
				{
					System.out.print("Enter a value to push on the queue: ");
					int value = scan.nextInt();

					if(queue.isFull())
					{
						System.out.println("ERROR: FULL STACK");
					}
					else
					{
						queue.enqueue(value);

					}
					break;
				}
				case 2:
				{
					if(queue.isEmpty())
					{
						System.out.println("ERROR: EMPTY QUEUE");
					}
					else
					{
						System.out.println(queue.dequeue());
					}
					break;
				}
				case 3:
				{
					if(queue.isEmpty())
					{
						System.out.println("ERROR: EMPTY QUEUE");
					}
					else
					{
						System.out.println(queue.peekFront());
					}
					break;
				}
				case 4:
				{
					System.out.println(queue.isEmpty());
					break;
				}
				case 5:
				{
					System.out.println(queue.isFull());
					break;
				}
				case 6:
				{
					queue.print();
					break;
				}
				case 7:
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