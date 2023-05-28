package Day8_Classroom;

import java.io.CharArrayWriter;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMethods {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println();
	}
}

class Stack {
	private int size = 50;

	private Character stack[] = new Character[size];

	private int top = 0;

	boolean push(Character element)
		{
		while(top<size)
		{
			stack[top] = element;
			top++;
			return true;
		}
		return false;
		}
	
	boolean pop(Character element)
	{
		while(top<size)
		{
			stack[top]=null;
			top--;
			return true;
		}
		return false;
	}
	
	Character pop() {
		Character element = null;
		if(top != 0)
		{
			element = stack[top-1];
			top--;
		}
		else {
			throw new EmptyStackException();
		}
		return element;
	}
	
	Character peek()
	{
		Character element = null;
		if(top != 0)
		{
			element = stack[top-1];
		}
		return element;
	}
	
	int getSize()
	{
		return top;
	}
	
	public String toString()
	{
		StringBuffer sb =  new StringBuffer();
		sb.append("[");
		for (int i = 0; i < top; i++) {
			sb.append(stack[i]+ ", ");
		}
		sb.append("[");
		return sb.toString();
	}
}
