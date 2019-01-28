import java.util.*;

public class ASGN050607Stacks
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		MyStack stack = new LinkedListStack();

		boolean valid = false;
		int option;

		while(!valid)
		{
			System.out.println("1: ArrayStack");
			System.out.println("2: LinkedListStack");
			System.out.print("Choice: "); option = scan.nextInt();

			switch(option)
			{
				case 1:
				{
					System.out.println("ArrayStack Maximum Size: ");
					stack = new ArrayStack(scan.nextInt());
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
			System.out.println("1: push");
			System.out.println("2: pop");
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
					System.out.print("Enter a value to push on the stack: ");
					int value = scan.nextInt();
					stack.push(value);
					break;
				}
				case 2:
				{
					if(stack.isEmpty())
					{
						System.out.println("ERROR: EMPTY STACK");
					}
					else
					{
						System.out.println(stack.pop());
					}
					break;
				}
				case 3:
				{
					if(stack.isEmpty())
					{
						System.out.println("ERROR: EMPTY STACK");
					}
					else
					{
						System.out.println(stack.peekTop());
					}
					break;
				}
				case 4:
				{
					System.out.println(stack.isEmpty());
					break;
				}
				case 5:
				{
					System.out.println(stack.isFull());
					break;
				}
				case 6:
				{
					stack.print();
					break;
				}
				case 7:
				{
					more = false;
					break;
				}
				case 8:
				{
					System.out.println(stack.size());
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