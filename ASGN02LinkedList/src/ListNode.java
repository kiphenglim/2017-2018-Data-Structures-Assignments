public class ListNode
{
	private Object value;
	private ListNode next;

	public ListNode(Object val, ListNode nxt)
	{
		value = val;
		next = nxt;
	}
	public Object getValue()
	{
		return value;
	}
	public ListNode getNext()
	{
		return next;
	}
	public void setValue(Object val)
	{
		value = val;
	}
	public void setNext(ListNode nxt)
	{
		next = nxt;
	}
}