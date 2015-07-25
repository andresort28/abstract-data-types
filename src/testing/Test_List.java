package testing;

import classes.List;

/**
 * Class that help with all the test that the SimpleList needs
 * @author Andres Ortiz - 10207000 ICESI
 *
 */
public class Test_List 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> list = new List<String>();
	
		System.out.println("SimpleList created...");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("All the elements were added successful \n");
		
		System.out.println("Elements in the list: ");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		
		System.out.println("Total of elements in the list: " + list.size());
		System.out.println("The list has any element ? : " + list.hasElements());
		System.out.println();
		
		System.out.println("Position of the letter A:  " + list.exist("A"));
		System.out.println("Position of the letter B:  " + list.exist("B"));
		System.out.println("Position of the letter C:  " + list.exist("C"));
		System.out.println("Position of the letter D:  " + list.exist("D"));
		System.out.println("Position of the letter E:  " + list.exist("E"));
		System.out.println("Position of the letter F:  " + list.exist("F"));
		System.out.println();
		System.out.println("Position of the letter W:  " + list.exist("W"));
		System.out.println();
		
		list.delete(0);
		System.out.println("The Element in the position 0 was deleted");
		System.out.println("The Following print is the result of the method toString of the list class");
		System.out.println(list.toString());
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		
		list.remove("E");
		System.out.println();
		System.out.println("The letter E was deleted");
		
		System.out.println();		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}

		
		
	 }

}
                  