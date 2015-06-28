package util;

import classes.List;

public interface IHashTable<K, V> 
{
	
	public abstract V put (K key, V value);
	
	public abstract boolean containsKey (K key);
	
	public abstract List<K> getKeys ();
	
	public abstract V getValue (K key);
	
	public abstract boolean remove (K key);
	
	public abstract int getSize ();
	
	public abstract void clear ();
	
	public abstract boolean isEmpty ();

}
