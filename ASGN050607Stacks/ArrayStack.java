public class ArrayStack implements MyStack
{
	private int stack[];
	private int capacity;
	private int size;

	public ArrayStack()
	{
		capacity = 10;
		stack = new int [capacity];
		size = 0;
	}

	public ArrayStack(int cap)
	{
		capacity = cap;
		stack = new int [capacity];
		size = 0;
	}

	public void push (int value)
	{
		if(isFull())
		{
			System.out.println("ERROR: FULL STACK");
		}
		else
		{
			stack[size] = value;
			size++;
		}
	}

	public int pop()
	{
		int tmp = stack[size - 1];
		size--;
		return tmp;
	}

	public int peekTop()
	{
		return stack[size-1];
	}

	public boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		return false;
	}

	public boolean isFull()
	{
		if (size == capacity)
		{
			return true;
		}
		return false;
	}

	public void print()
	{
		int temp [] = new int[size];
		
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = stack[i];
		}

		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(this.pop());
		}
		
		for(int i = 0; i < temp.length; i++)
		{
			this.push(temp[i]);
		}
	}

	public int size()
	{
		return size;
	}
}