package myPack;
//incomplete
public class FixedStack implements Stack {
	int size;
	FixedStack(int i)
	{
		System.out.println("Size of the stack is " + i);
		size=i;
	}
	
	public void push(int i)
	{
		if (i > size)
		{
			System.out.println("Stack is full");
		}
	}
	
	public int pop()
	{
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FixedStack fs = new FixedStack(10);
         
         fs.push(20);
	}

}
