public class Node
{
	private int value;
	private Node next;

	public Node(int v) { value = v; }
	public int getValue() { return value; }
	public Node getNext() { return next; }
	public void setValue(int v) { value = v; }
	public void setNext(Node node) { next = node; }
}