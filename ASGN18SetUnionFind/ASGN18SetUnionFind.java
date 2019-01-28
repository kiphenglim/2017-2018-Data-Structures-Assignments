import java.util.*;

public class ASGN18SetUnionFind
{
	public static void main(String args[])
	{
		System.out.println("SET: UNION, FIND");
		Scanner scan = new Scanner(System.in);
		System.out.print("SET SIZE: ");
		int cap = scan.nextInt();
		System.out.println();
		System.out.println();
		DisjointSet sets = new DisjointSet(cap);
		boolean more = true;

		while(more)
		{
			System.out.println("1: UNION");
			System.out.println("2: FIND");
			System.out.println("3: PRINT");
			System.out.println("4: QUIT");
			System.out.print("CHOICE: ");
			int choice = scan.nextInt();
			System.out.println();
			
			switch (choice)
			{
				case 1:
				{
					System.out.print("VALUE 1: ");
					int v1 = scan.nextInt();
					System.out.print("VALUE 2: ");
					int v2 = scan.nextInt();
					sets.union(v1, v2);
					break;
				}
				case 2:
				{
					System.out.print("VALUE: ");
					System.out.println(sets.findSet(scan.nextInt()));
					break;
				}
				case 3:
				{
					sets.print();
					break;
				}
				case 4:
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
	}
}