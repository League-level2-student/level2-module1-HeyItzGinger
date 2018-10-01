package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("hi");
		list.add("aloha");
		list.add("hola");
		list.add("namaste");
		list.add("ciao");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println();
		for(String s: list) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println();
		for(int g = 0; g < list.size(); g ++) {
			if(g%2==0) {
				System.out.println(list.get(g));
			}
		}
		//6. Print all the Strings in reverse order.
		System.out.println();
		for(int l = list.size(); l > 0; l --) {
			System.out.println(list.get(l-1));
		}
		//7. Print only the Strings that have the letter 'h' in them.
		System.out.println();
		for (int s = 0; s < list.size(); s++) {
		if (list.get(s).contains("h")) {
			System.out.println(list.get(s));
		}
	}
	
	}
}
