import java.util.*;

public class LinkedListQueue implements MyQueue
{
	private Node front;
	private Node back;

	public void enqueue (int value)
	{
		Node node = new Node (value);

		if (isEmpty())
		{
			front = node;
		}
		else
		{
			back.setNext(node);
		}

		back = node;
	}

	public int dequeue ()
	{
		int temp = front.getValue();
		front = front.getNext();
		return temp;
	}

	public int peekFront()
	{
		return front.getValue();
	}

	public boolean isEmpty()
	{
		if(front == null)
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
		LinkedList<Integer> list = new LinkedList<Integer>();

		while(front != null)
		{
			list.add(dequeue());
		}

		for(int i = 0; i < list.size() ; i++)
		{
			System.out.println(list.get(i));
			enqueue(list.get(i));
		}
	}
}