import java.util.*;

public class ASGN151617Hashing
{
	public static void main(String args[])
	{
		System.out.println("HASHING");
		System.out.println();
		boolean more = true;
		Scanner scan = new Scanner(System.in);

		Hash hash = new HashChain();

		System.out.println("1: HashChain");
		System.out.println("2: HashProbe");
		System.out.print("CHOICE... ");

		while(more)
		{
			switch(scan.nextInt())
			{
				case 1:
				{
					System.out.println("HASHCHAIN SUCCESSFUL");
					more = false;
					break;
				}
				case 2:
				{
					hash = new HashProbe();
					System.out.print("CHANGE PROBE SIZE? (Y/N) ");

					if(scan.next().toUpperCase().equals("Y"))
					{
						System.out.print("INPUT PROBE SIZE: ");
						hash = new HashProbe(scan.nextInt());
					}

					System.out.println("HASHPROBE SUCCESSFUL");
					more = false;
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR");
					break;
				}
			}
		}

		System.out.println();

		more = true;

		while(more)
		{
			System.out.println("1: INSERT");
			System.out.println("2: FIND");
			System.out.println("3: DELETE");
			System.out.println("4: QUIT");
			System.out.println("5: PRINT");
			System.out.print("CHOICE: ");

			int choice = scan.nextInt();
			System.out.println();

			switch(choice)
			{
				case 1:
				{
					System.out.print("VALUE: ");
					if(hash.insert(scan.nextInt()))
					{
						System.out.println("INSERT SUCCESSFUL");
					}
					else
					{
						System.out.println("INSERT UNSUCCESSFUL");
					}
					break;
				}
				case 2:
				{
					System.out.print("VALUE: ");
					if(hash.find(scan.nextInt()))
					{
						System.out.println("FIND SUCCESSFUL");
					}
					else
					{
						System.out.println("FIND UNSUCCESSFUL");
					}
					break;
				}
				case 3:
				{
					System.out.print("VALUE: ");
					if(hash.delete(scan.nextInt()))
					{
						System.out.println("DELETE SUCCESSFUL");
					}
					else
					{
						System.out.println("DELETE UNSUCCESSFUL");
					}
					break;
				}
				case 4:
				{
					more = false;
					break;
				}
				case 5:
				{
					hash.print();
					break;
				}
				default:
				{
					System.out.println("INPUT ERROR");
				}
			}

			System.out.println();
			System.out.println();
		}
	}
}