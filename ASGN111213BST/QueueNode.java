public class QueueNode
{
	private Node node;
	private QueueNode next;

	public QueueNode(Node nd)
	{
		node = nd;
	}

	public Node getNode()
	{
		return node;
	}

	public QueueNode getNext()
	{
		return next;
	}

	public void setNext(QueueNode qNode)
	{
		next = qNode;
	}
}