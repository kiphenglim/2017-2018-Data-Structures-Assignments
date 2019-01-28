public class DoublyLinkedList
{
	private Node head;
	private Node tail;

	public DoublyLinkedList()
	{
		head = null;
		tail = null;
	}

	public boolean isEmpty()
	{
		if(this.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isSorted()
	{
		boolean sorted = true;

		for(Node node = head ; node != null ; node = node.getNext())
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

	public void insertInOrder(int v)
	{
		Node current = head;

        if(current == null || v <= current.getValue())
        { this.insertHead(v); }
        else
        {
			while(current.getNext() != null && v > current.getNext().getValue())
			{ current = current.getNext(); }

			if(current.getNext() == null)
			{ insertTail(v); }
			else
			{
				Node node = new Node (v);
	       		node.setPrevious(current);
	       		node.setNext(current.getNext());
	       		current.getNext().setPrevious(node);
	            current.setNext(node);
			}
  		}
	}

	public void insertHead(int v)
	{
		if(this.isEmpty())
		{
			head = new Node (v);
			tail = head;
		}
		else
		{
			Node node = new Node (v);
			node.setNext(head);
			head.setPrevious(node);
			head = node;
		}
	}

	public void insertTail(int v)
	{
        if(this.isEmpty())
        {
            head = new Node (v);
			tail = head;
        }
        else
        {
        	Node node = new Node(v);
        	tail.setNext(node);
        	node.setPrevious(tail);
            tail = node;
		}
	}

	public void print()
	{
		System.out.println("List: ");
		for (Node node = head; node != null ; node = node.getNext())
		{
			System.out.println(node.getValue());
		}
	}

	public void printBackwards()
	{
		System.out.println("List: ");
		for (Node node = tail; node != null ; node = node.getPrevious())
		{
			System.out.println(node.getValue());
		}
	}

	public boolean removeFirstMatch(int v)
	{
		boolean found = false;

		Node current = head;

		if(!this.isEmpty())
		{
			if(current.getValue() != v)
			{
				while (current.getNext() != null && current.getNext().getValue() != v)
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
						current.getNext().setPrevious(current);
						found = true;
					}
				}
				catch (Exception e)
				{}
			}
			else
			{
				if(this.size() == 1)
				{
					head = null;
					tail = null;
				}
				else
				{
					head.getNext().setPrevious(null);
					head = head.getNext();
				}
				found = true;
			}
		}

		return found;
	}

	public int size()
	{
		int size = 0;

		for (Node node = head; node != null ; node = node.getNext())
		{
			size++;
		}

		return size;
	}
}