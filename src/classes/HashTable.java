package classes;

import elements.HashElement;
import util.IHashTable;

public class HashTable<K, V> implements IHashTable<K, V>
{
	//Collision by chaining
	private List<HashElement<K, V>>[] lists;	
	
	/**
	 * Numbers total of possible lists
	 */
	private int capacity;
	
	/**
	 * Numbers of list of elements in the hash table, NOT numbers of elements
	 */
	private int size;
	
	
	public HashTable (int capacity)
	{
		this.capacity = capacity;
		size = 0;
		lists = new List[capacity];	
	}
	
	
	/**
	 * Method that apply a Hashing function and return a position
	 * @param key
	 * @return
	 */
	private int getPosition (K key)
	{	
		int code = Math.abs(key.hashCode());		
		return (capacity-1) - (code%capacity);
	}
	
	
	@Override
	public String toString ()
	{
		String table = "/-----------------------------------------/ \n HashTable Elements \n";
		for (int i = 0; i < lists.length; i++) 
		{
			List<HashElement<K, V>> temp = lists[i];
			if(temp != null)
			{
				table += "Position #" + i + ":  " + temp.toString() + " \n";
			}
			else
				table += "Position #" + i + ":  " + "null \n";
		}
		return table + "\n /-----------------------------------------/";
	}
	
	//-----------------------------------------------------------

	@Override
	public V put(K key, V value) 
	{
		V valueOld = null;
		HashElement<K, V> element = new HashElement<K, V>(key, value);
		int pos = getPosition(key);
		System.out.println(pos);
		List<HashElement<K, V>> list = lists[pos];
			
		if (list == null)
		{
			list = new List<HashElement<K,V>>();
			size++;
			list.add(element);
			lists[pos] = list;			
		}
		else
		{
			for (int i = 0; i < list.size(); i++) 
			{
				HashElement<K, V> e = list.get(i);
				if(e != null && e.getKey().equals(key))
				{
					valueOld = e.getValue();
					e.setValue(value);
					break;
				}
			}
			if(valueOld == null)
				list.add(element);	
		}		
		return valueOld;
	}

	@Override
	public boolean containsKey(K key) 
	{
		int pos = getPosition(key);		
		List<HashElement<K, V>> list = lists[pos];
		if(list !=null)
		{
			for (int i = 0; i < list.size(); i++) 
			{
				HashElement<K, V> e = list.get(i);
				if(e != null && e.getKey().equals(key))
					return true;
			}	
		}
		return false;
	}

	@Override
	public List<K> getKeys() 
	{
		List<K> keys = new List<K>();
		for (int i = 0; i < lists.length; i++) 
		{
			List<HashElement<K, V>> list = lists[i];
			if(list != null)
			{
				for (int j = 0; j < list.size(); j++) 
				{
					HashElement<K, V> e = list.get(i);
					if(e != null)
						keys.add(e.getKey());
				}
			}
		}		
		return keys;
	}

	@Override
	public V getValue(K key) 
	{
		int pos = getPosition(key);		
		List<HashElement<K, V>> list = lists[pos];
		if(list !=null)
		{
			for (int i = 0; i < list.size(); i++) 
			{
				HashElement<K, V> e = list.get(i);
				if(e != null && e.getKey().equals(key))
					return e.getValue();
			}	
		}
		return null;
	}

	@Override
	public boolean remove(K key) 
	{
		int pos = getPosition(key);		
		List<HashElement<K, V>> list = lists[pos];
		if(list !=null)
		{
			for (int i = 0; i < list.size(); i++) 
			{
				HashElement<K, V> e = list.get(i);
				if(e != null && e.getKey().equals(key))
				{
					boolean r = list.delete(i);
					if(!list.hasElements())
					{
						lists[pos] = null;
						size--;
					}
					return r;
				}					
			}	
		}
		return false;
	}

	@Override
	public int getSize() 
	{
		return size;
	}

	@Override
	public void clear() 
	{
		lists = new List[capacity];			
	}

	@Override
	public boolean isEmpty() 
	{
		if(size == 0)
			return true;
		return false;
	}
	
}
