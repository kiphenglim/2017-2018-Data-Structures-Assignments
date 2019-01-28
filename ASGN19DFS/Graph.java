import java.util.*;

public class Graph
{
	private ArrayList <Vertex> vertices;
	private ArrayList <VertexState> marked;

	enum VertexState
	{
        yes, no
    }

	public Graph()
	{
		vertices = new ArrayList<Vertex>();
		marked = new ArrayList<VertexState>();
	}

	public void add(Vertex v)
	{
		vertices.add(v);
		marked.add(VertexState.no);
	}

	public void connect(Vertex v1, Vertex v2)
	{
		v1.addAdj(v2);
		v2.addAdj(v1);
	}


	public void DFS()
	{
		for(VertexState state : marked)
		{
			state = VertexState.no;
		}

		DFS(vertices.get(0));
	}

	public Vertex getVertex(int v)
	{
		return vertices.get(v);
	}


	private void DFS(Vertex root)
	{
		System.out.println("Vertex " + vertices.indexOf(root) + " ; VALUE " + root.getValue());

		marked.set(vertices.indexOf(root), VertexState.yes);

		for(Vertex newRoot : root.getAdj())
		{
			if(marked.get(vertices.indexOf(newRoot)) == VertexState.no)
			{
				DFS(newRoot);
			}
		}

	}
}