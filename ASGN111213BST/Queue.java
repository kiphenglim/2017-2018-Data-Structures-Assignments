public class Queue
{
	private QueueNode front;
	private QueueNode back;

	public Queue()
	{
		front = null;
		back = null;
	}

	public void enqueue(Node node)
	{
		QueueNode qNode = new QueueNode(node);

		if(back != null)
		{
			back.setNext(qNode);
		}

		back = qNode;

		if(front == null)
		{
			front = qNode;
		}
	}

	public Node dequeue()
	{
		if(isEmpty())
		{
			return null;
		}

		QueueNode answer = front;
		front = front.getNext();

		if(isEmpty())
		{
			back = null;
		}

		return answer.getNode();
	}

	boolean isEmpty()
	{
		return (front == null);
	}
}