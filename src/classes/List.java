package classes;

import util.IList;
import elements.NodeList;

/**
 * Class that represent a lineal simple list which implement OList
 * @author Andres Ortiz - 10207000 ICESI
 *
 * @param <T> - Type of Object of list´ elements.
 */
public class List<T> implements IList<T>
{
	/**
	 * Firts node of the list
	 */
	private NodeList<T> first;
	
		
	/**
	 * Last node of the list
	 */
	private NodeList<T> last;
	
	/**
	 * Size of the list
	 */
	private int size;
	
	/**
	 * Constructor method of the SimpleList
	 */
	public List ()
	{
		first = null;
		last = null;
		size = 0;		
	}

	@Override
	public void add(T obj) 
	{
		if(size == 0)
		{
			first = new NodeList<T>(obj);
			last = first;
		}
		else
		{
			NodeList<T> temp = new NodeList<T>(obj);
			last.setNext(temp);
			last = temp;
		}
		size++;
	}

	@Override
	public boolean remove(T obj) 
	{
		NodeList<T> node = first;
		NodeList<T> before = first;
		for (int i = 0; i < size; i++) 
		{
			T element = node.getElement();
			if(element == obj)
			{
				if(i == 0)
					first = first.getNext();
				else
				{
					NodeList<T> temp = node.getNext();
					node.setNext(null);
					before.setNext(temp);
				}
				size--;
				return true;
			}
			before = node;
			node = node.getNext();
		}
		return false;
	}
	
	
	@Override
	public boolean delete (int pos) 
	{
		NodeList<T> node = first;
		NodeList<T> before = first;
		for (int i = 0; i < size; i++) 
		{
			if(i == pos)
			{
				if(i == 0)
					first = first.getNext();
				else
				{
					NodeList<T> temp = node.getNext();
					node.setNext(null);
					before.setNext(temp);
				}
				size--;
				return true;
			}
			before = node;
			node = node.getNext();
		}
		return false;
	}

	@Override
	public T get(int index) 
	{
		NodeList<T> node = first;
		for (int i = 0; i < size; i++) 
		{
			if(i == index)
				return node.getElement();
			node = node.getNext();
		}
		return null;
	}

	@Override
	public int exist(T obj) 
	{
		NodeList<T> node = first;
		for (int i = 0; i < size; i++) 
		{
			T element = node.getElement();
			if(element == obj)
				return i;
			node = node.getNext();
		}
		return -1;
	}

	@Override
	public boolean hasElements() 
	{
		if(size > 0)
			return true;
		else
			return false;
	}

	@Override
	public void removeAll() 
	{
		first = null;
		last = null;
		size = 0;
	}
	
	@Override
	public int size() 
	{
		return size;
	}
	
	
	@Override
	public String toString ()
	{
		String list = "[ ";
		NodeList<T> node = first;
		
		while(node != null)
		{
			list += node.toString() + ", ";
			node = node.getNext();
		}		
		return list + "]";
	}
	
	
	//----------------------------------------------------------------------------------------------
	
	/**
	 * Method that return the first element of the list
	 * @return
	 */
	public T getFirst ()
	{
		if(first != null)
			return first.getElement();
		else
			return null;
	}

	/**
	 * Method that return the last element of the list
	 * @return
	 */
	public T getLast ()
	{
		if(last != null)
			return last.getElement();
		else
			return null;
	}
	
	/**
	 * 
	 */
	public void removeFirst ()
	{
		if(first != null)
		{
			NodeList<T> node = first.getNext();
			if(node != null)
				first = node;
			else
				first= null;
		}
	}
	
	/**
	 * 
	 */
	public void removeLast ()
	{
		
	}
}
