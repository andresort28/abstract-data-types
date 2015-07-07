package Graph;

public class Path 
{
	private int n;
	public Path (int n)
	{
		this.n = n;
	}
	
	@Override
	public int hashCode ()
	{
		return n;
	}
}
