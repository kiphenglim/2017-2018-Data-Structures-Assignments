import java.util.*;

public class Vertex
{
	private int value;
	private ArrayList <Vertex> adj;

	public Vertex (int v)
	{
		value = v;
		adj = new ArrayList <Vertex>();
	}

	public void addAdj(Vertex v)
	{
		adj.add(v);
	}

	public int getValue()
	{
		return value;
	}

	public ArrayList <Vertex> getAdj()
	{
		return adj;
	}
}