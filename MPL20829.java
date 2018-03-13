package midterm;

import java.util.ArrayList;

public class MPL20829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given that an ArrayList named a with elements of type 
		 * Integer has been declared, assign 3 to its  first element.
		 */
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(12);
		
		a.set(0, 3);
		System.out.println(a);
	}

}
