public class Node
{
	private int value;
	private Node left;
	private Node right;

	public Node(int v) {value = v;}

	public int getValue() {return value;}

	public void setValue(int v) {value = v;}

	public Node getLeft() {return left;}

	public void setLeft(Node node) {left = node;}

	public Node getRight() {return right;}

	public void setRight(Node node) {right = node;}
}
