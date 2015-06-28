package util;

/**
 * Interface of a basic list
 * @author Andres Ortiz - 10207000 ICESI
 *
 * @param <T> - Type of Object of an elements´ list.
 */
public interface IList<T> 
{
	/**
	 * Method that add a new element in the list
	 * @param obj - Object to add
	 */
	public abstract void add(T obj);
	
	/**
	 * Method that remove the element received as parameter
	 * @param obj - Object to remove
	 * @return true is the removing was successful, false in other case
	 */
	public abstract boolean remove (T obj);
	
	/**
	 * Method that remove the element in the position received as parameter
	 * @param pos - Position of the element to be deleted
	 * @return true is the removing was successful, false in other case
	 */
	public abstract boolean delete (int pos);
	
	/**
	 * Method that allow to get an specific element given its position
	 * @param index - Position of the element
	 * @return A generic element if the position is between the limits, null in other case
	 */
	public abstract T get (int index);
	
	/**
	 * Method that search an element
	 * @param obj - Element to find out
	 * @return The position in the list if the element is found out, -1 in other case
	 */
	public abstract int exist (T obj);
	

	/**
	 * Method that allow to know if there is any element
	 * @return true if there is at most one element, false if there are not elements
	 */
	public abstract boolean hasElements ();
	
	/**  
	 * Method that return the total number of elements
	 * @return - the total number of elements
	 */
	public abstract int size ();
	
	/**
	 * Method that remove all the elements
	 */
	public abstract void removeAll ();
	
}
