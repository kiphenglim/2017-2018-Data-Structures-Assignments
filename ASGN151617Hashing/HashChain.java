import java.util.*;

public class HashChain implements Hash
{
	private final int CAPACITY = 11;
	private int capacity;
	private ArrayList<Integer> hash [];

	public HashChain()
	{
		init();
	}

	public boolean insert(int value)
	{
		hash[hashmod(value)].add(value);
		return true;
	}

	public boolean find(int value)
	{
		for(int i : hash[hashmod(value)])
		{
			if(value == i) return true;
		}
		return false;
	}

	public boolean delete(int value)
	{
		if(hash[hashmod(value)].contains(value))
		{
			hash[hashmod(value)].remove((Integer) value);
			return true;
		}
		else
		{
			return false;
		}
	}

	public void print()
	{
		for(int i = 0 ; i < capacity ; i++)
		{
			if(i < 10) System.out.print(i + "     ");
			else System.out.print(i + "    ");

			for(int n : hash[i])
			{
				System.out.print(n + " ");
			}

			System.out.println();
		}
	}

	private void init()
	{
		capacity = CAPACITY;
		hash = new ArrayList [capacity];

		for(int i = 0; i < capacity; i++)
		{
			hash[i] = new ArrayList<Integer> ();
		}
	}

	private int hashmod(int value)
	{
		return value % CAPACITY;
	}
}