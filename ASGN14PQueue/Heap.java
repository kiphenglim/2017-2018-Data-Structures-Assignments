public class Heap
{
	private int heap [];
	private int capacity;
	private int size;

	public Heap()
	{
		capacity = 10;
		size = 0;
		heap = new int[capacity + 1];
	}

	public Heap(int capacity)
	{
		this.capacity = capacity;
		size = 0;
		heap = new int[capacity + 1];
	}

	public int size()
	{
		return size;
	}

	public boolean insert(int priority)
	{
		if(size() == capacity)
		{
			return false;
		}
		else if(size() == 0)
		{
			heap[1] = priority;
			size++;
			return true;
		}
		else
		{
			int hole = size + 1;
			boolean condition = false;

			while(!condition)
			{
				if (priority >= heap[hole / 2] || hole == 1)
				{
					heap[hole] = priority;
					size++;
					condition = true;
				}
				else
				{
					heap[hole] = heap[hole / 2];
					hole = hole / 2;
				}
			}

			return condition;
		}
	}

	public int remove()
	{
		int root = heap [1];
		int hole = 1;
		int rightmost = heap[size];
		size--;

		while(2 * hole + 1 <= size && (heap[2 * hole] < rightmost || heap[2 * hole + 1] < rightmost))
		{
			if(heap[2 * hole] < heap[hole * 2 + 1])
			{
				heap[hole] = heap [hole * 2];
				hole = hole * 2;
			}
			else
			{
				heap[hole] = heap [hole * 2 + 1];
				hole = hole * 2 + 1;
			}
		}

		heap[hole] = rightmost;
		
		return root;
	}

	public void print()
	{
		if(size == 0)
		{
			return;
		}

		int index = 1;
		int length = 1;

		boolean more = true;

		while(more)
		{
			for(int pos = 1; pos <= length && more; pos++)
			{
				if(index <= size)
				{
					System.out.print(heap[index] + " ");
					index++;
				}

				else
				{
					more = false;
				}
			}

			System.out.println();
			length *= 2;
		}
	}
}