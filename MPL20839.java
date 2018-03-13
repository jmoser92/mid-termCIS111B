package midterm;

import java.util.ArrayList;

public class MPL20839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Assume that an ArrayList of integers named a has been declared and initialized. Write a single statement that 
		 * assigns a new value to the first element of the ArrayList. The new value should be equal to twice the value 
		 * stored in the last element of the ArrayList.*/
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(12);
		
		a.set(0, (2*(a.get(a.size()-1))));
		System.out.println(a);
		
	}

}
