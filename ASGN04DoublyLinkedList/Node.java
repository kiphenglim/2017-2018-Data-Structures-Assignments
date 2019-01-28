public class Node
{
	private int value;
	private Node previous;
	private Node next;

	public Node(int v)
	{
		value = v;
		previous = null;
		next = null;
	}

	public Node getNext()
	{
		return next;
	}

	public Node getPrevious()
	{
		return previous;
	}

	public int getValue()
	{
		return value;
	}

	public void setNext(Node node)
	{
		next = node;
	}

	public void setPrevious(Node node)
	{
		previous = node;
	}

	public void setValue(int v)
	{
		value = v;
	}
}