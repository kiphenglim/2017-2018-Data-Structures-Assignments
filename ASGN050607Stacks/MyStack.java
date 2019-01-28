public interface MyStack
{
	void push (int value);
	int pop();
	int peekTop();
	boolean isEmpty();
	boolean isFull();
	void print();
	int size();
}