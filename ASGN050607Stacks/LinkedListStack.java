import java.util.*;

public class LinkedListStack implements MyStack
{
	Node top;

	public void push(int value)
	{
		Node node = new Node(value);
		node.setNext(top);
		top = node;
	}

	public int pop()
	{
		Node node = top;
		top = top.getNext();
		return node.getValue();
	}

	public int peekTop()
	{
		return top.getValue();
	}

	public boolean isEmpty()
	{
		if (top == null)
		{
			return true;
		}
		return false;
	}

	public boolean isFull()
	{
		return false;
	}

	public void print()
	{
		LinkedList<Integer> tmp = new LinkedList<Integer>();

		for(Node node = top ; node != null; node = node.getNext())
		{
			tmp.addLast(node.getValue());
			System.out.println(pop());
		}

		while(tmp.size() != 0)
		{
			push(tmp.removeLast());
		}
	}

	public int size()
	{
		int size = 0;

		for(Node node = top; node != null; node = node.getNext())
		{
			size++;
		}

		return size;
	}

}