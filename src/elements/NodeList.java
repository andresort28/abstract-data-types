package elements;

/**
 * Class that represent a node with a generic element
 * @author Andres Ortiz - 10207000 ICESI
 *
 * @param <T> - Type of object of the node
 */
public class NodeList<T> 
{
	/**
	 * Element of the node
	 */
	private T element;
	
	/**
	 * The following node
	 */
	private NodeList<T> next;
	
	/**
	 * Constructor method of a Node
	 * @param element
	 */
	public NodeList (T element)
	{
		this.element = element;
		next = null;
	}
	
	/**
	 * Method that allow to get the following node
	 * @return - the following node
	 */
	public NodeList<T> getNext ()
	{
		return next;
	}
	
	/**
	 * Method that allow to get the element of the node
	 * @return - The element of the node
	 */
	public T getElement ()
	{
		return element;
	}
	
	/**
	 * Method that set which will be the following node
	 * @param next - The following node
	 */
	public void setNext (NodeList<T> next)
	{
		this.next = next;
	}
	
	
	@Override
	public String toString ()
	{
		return element.toString();
	}
	
	
}
