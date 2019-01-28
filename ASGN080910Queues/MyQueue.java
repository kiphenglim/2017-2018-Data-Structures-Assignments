public interface MyQueue
{
	void enqueue(int value);
	int dequeue();
	int peekFront();
	boolean isEmpty();
	boolean isFull();
	void print();
}