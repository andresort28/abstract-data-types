package classes;


public class Vertex<T> implements Comparable<Vertex<T>>
{
	private T vertice;	
	
	public Vertex (T vertice)
	{
		this.vertice = vertice;
	}
	
	public T getVertice ()
	{
		return vertice;
	}
	
	public String toString ()
	{
		return vertice.toString();
	}

	@Override
	public int compareTo(Vertex<T> v) 
	{
		return toString().compareTo(v.toString());
	}

	public boolean equals (Object v)
	{
		return toString().equals(v.toString());
	}

}
