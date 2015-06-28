package classes;

import util.IStack;

public class Stack<T> implements IStack<T>
{
	private List<T> list;
	
	public Stack ()
	{
		list = new List<T>();
	}

	@Override
	public void push(T obj) 
	{
		list.add(obj);
	}

	@Override
	public void pop() 
	{
		
	}

	@Override
	public boolean isEmpty() 
	{
		return !list.hasElements();
	}

	@Override
	public T getElement() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
