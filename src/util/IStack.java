package util;

/**
 * Interface of a basic Stack
 * @author Andres Ortiz - 10207000 ICESI
 *
 * @param <T> - Type of Object of an elements´ Stack
 */
public interface IStack<T>
{
	/**
	 * 
	 * @param obj
	 */
	public abstract void push (T obj);
	
	/**
	 * 
	 */
	public abstract void pop ();
	
	/**
	 * 
	 * @return
	 */
	public abstract boolean isEmpty ();
	
	/**
	 * 
	 * @return
	 */
	public abstract T getElement();
	
}
