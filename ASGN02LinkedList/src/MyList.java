public class MyList
{
	private ListNode head;
	private ListNode tail;

	public MyList()
	{
		head = null;
		tail = null;
	}

	public void insertAtHead(Object val)
	{
		if(this.isEmpty())
		{
			head = new ListNode (val, null);
			tail = new ListNode (val, null);
		}
		else
		{
			head = new ListNode (val, head);
		}
	}

	public void insertAtTail(Object val)
	{
		ListNode newNode = new ListNode(val, null);

        if(this.isEmpty())
        {
            this.insertAtHead(val);
        }
        else
        {
            tail.setNext(newNode);
		}
		tail = newNode;
	}

	public void insertInOrder(Object val)
	{
		ListNode current = head;

        if(current == null
        	|| (int) val <= (int) head.getValue())
        {
            this.insertAtHead(val);
        }
        else
        {
			while(current.getNext() != null &&
				(int) val > (int) current.getNext().getValue())
			{
			    current = current.getNext();
			}

       		ListNode node = new ListNode(val, current.getNext());
            current.setNext(node);
  		}
	}

	public boolean removeFirstMatch(Object val)
	{
		boolean found = false;

		ListNode current = head;

		if(!this.isEmpty())
		{
			if(current.getValue() != val)
			{
				while (current.getNext() != null && current.getNext().getValue() != val)
				{
					current = current.getNext();
				}

				try
				{
					if(current.getNext().getNext() == null)
					{
						tail = current;
						tail.setNext(null);
						found = true;
					}
					else
					{
						current.setNext(current.getNext().getNext());
						found = true;
					}
				}
				catch (Exception e)
				{}
			}
			else
			{	if(this.size() == 1)
				{
					head = null;
					tail = null;
				}
				else
				{
					head = head.getNext();
				}
				found = true;
			}
		}

		return found;
	}

	public boolean isSorted()
	{
		boolean sorted = true;

		for(ListNode node = head ; node != null ; node = node.getNext())
		{
			try
			{
				if ((int) node.getValue() > (int) node.getNext().getValue())
				{
					sorted = false;
				}
			}
			catch (Exception E)
			{}
		}

		return sorted;
	}

	public boolean isEmpty()
	{
		if(head == null && tail == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void print()
	{
		System.out.println("List: ");
		for (ListNode node = head; node != null ; node = node.getNext())
		{
			System.out.println(node.getValue());
		}
	}

	public int size()
	{
		int size = 0;

		for (ListNode node = head; node != null ; node = node.getNext())
		{
			size++;
		}

		return size;
	}
}