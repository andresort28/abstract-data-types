package testing;

import classes.HashTable;
import classes.List;

public class Test_HashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		HashTable<String, String> table = new HashTable<String, String>(10);
	
		System.out.println("HashTable created...");
		table.put("A", "1");
		table.put("B", "2");
		table.put("C", "3");
		table.put("D", "4");
		table.put("E", "5");
		table.put("F", "6");		
		System.out.println("All the elements were added successful \n");
		System.out.println(table.getSize());
		
		System.out.println(table.toString());
		System.out.println("Value of C  " + table.getValue("C"));
		System.out.println("Value of A  " + table.getValue("A"));
		System.out.println("Value of F  " + table.getValue("F"));
		
		
		
//		System.out.println("Elements in the list: ");
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
//		System.out.println("\n");
//		
//		System.out.println("Total of elements in the list: " + list.size());
//		System.out.println("The list has any element ? : " + list.hasElements());
//		System.out.println();
//		
//		System.out.println("Position of the letter A:  " + list.exist("A"));
//		System.out.println("Position of the letter B:  " + list.exist("B"));
//		System.out.println("Position of the letter C:  " + list.exist("C"));
//		System.out.println("Position of the letter D:  " + list.exist("D"));
//		System.out.println("Position of the letter E:  " + list.exist("E"));
//		System.out.println("Position of the letter F:  " + list.exist("F"));
//		System.out.println();
//		System.out.println("Position of the letter W:  " + list.exist("W"));
//		System.out.println();
//		
//		list.delete(0);
//		System.out.println("The Element in the position 0 was deleted");
//		System.out.println("The Following print is the result of the method toString of the list class");
//		System.out.println(list.toString());
//		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
//		
//		
//		list.remove("E");
//		System.out.println();
//		System.out.println("The letter E was deleted");
//		
//		System.out.println();		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}

		
		
	 

	}

}
