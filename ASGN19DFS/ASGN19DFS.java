import java.util.*;

public class ASGN19DFS
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Graph graph = new Graph();
		boolean more = true;

		System.out.println("IMPLEMENTING CONNECTED UNDIRECTED GRAPH");
		System.out.println("USING DEPTH FIRST SEARCH");
		System.out.println();
		System.out.println();

		while (more)
		{
			System.out.println("1: ADD VERTEX");
			System.out.println("2: CONNECT VERTICES");
			System.out.println("3: DFS");
			System.out.println("4: QUIT");
			System.out.print("CHOICE: ");

			int choice = scan.nextInt();

			switch(choice)
			{
				case 1:
				{
					System.out.print("INPUT VERTEX VALUE: ");
					graph.add(new Vertex(scan.nextInt()));
					break;
				}
				case 2:
				{
					System.out.print("VERTEX 1: ");
					int v1 = scan.nextInt();
					System.out.print("VERTEX 2: ");
					int v2 = scan.nextInt();

					graph.connect(graph.getVertex(v1), graph.getVertex(v2));
					break;
				}
				case 3:
				{
					graph.DFS();

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