public class ArrayQueue implements MyQueue
{
	private int queue [];
	private int capacity;
	private int front;
	private int back;
	private int elements;

	public ArrayQueue ()
	{
		capacity = 10;
		queue = new int [10];
		front = 0;
		back = -1;
		elements = 0;
	}

	public ArrayQueue (int cap)
	{
		capacity = cap;
		queue = new int [capacity];
		front = 0;
		back = -1;
		elements = 0;
	}

	public void enqueue (int value)
	{
		if(isEmpty())
		{
			queue[front] = value;
			back = 0;
		}
		else
		{
			if(back == capacity - 1)
			{
				back = 0;
			}
			else
			{
				back++;
			}

			queue[back] = value;
		}

		elements++;
	}

	public int dequeue()
	{
		int temp = queue[front];

		if(elements == 1)
		{
			front = 0;
			back = -1;
		}
		else
		{
			if(front == capacity - 1)
			{
				front = 0;
			}
			else
			{
				front++;
			}
		}

		elements--;
		return temp;
	}

	public int peekFront()
	{
		return queue[front];
	}

	public boolean isEmpty()
	{
		if(back == -1)
		{
			return true;
		}

		return false;
	}

	public boolean isFull()
	{
		if(elements == capacity)
		{
			return true;
		}

		return false;
	}

	public void print()
	{
		ArrayQueue work = new ArrayQueue(elements);

		while(!this.isEmpty())
		{
			System.out.println(this.peekFront());
			work.enqueue(this.dequeue());
		}

		while(!work.isEmpty())
		{
			this.enqueue(work.dequeue());
		}
	}
}