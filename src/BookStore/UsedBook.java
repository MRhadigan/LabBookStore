package BookStore;

import java.util.ArrayList;

public class UsedBook extends Book {

	/**
	 * @return 
	 * @return 
	 * 
	 */
	public static String used() {
		int i;
		ArrayList<String> usedBook = new ArrayList<>();
		usedBook.add("1: J.K. Rowling, Harry Potter, 14.99, 39581085436");
		usedBook.add("2: Orson Scott Card, Ender's Game, 9.99, 34019581093");
		usedBook.add("3: Monica's Pizza, Monica Green, 6.99, 4810398140");
		
		for (String arrBook: usedBook) {
			System.out.println(usedBook.toString());
		}
		return "";
		
		//for (i = 0; i < usedBook.size(); i++);
		
		
		//return usedBook.get(1) + usedBook.get(2) + usedBook.get(3);
	

	}
	
	public static  String newBook() {
		
	int i;
	ArrayList<String> newBook = new ArrayList<>();
	newBook.add("1: George rr Martin, Game of Thrones, 29.99, 2412074153");
	newBook.add("2: Beginning Java, Joel Murach, 39.99, 394810934531");
	newBook.add("3: Dictionary, John Doe, 19.99, 39481093831");
	
//	for (i = 0; i < newBook.size(); i++);
//	
//	
return newBook.get(0) + newBook.get(1) + newBook.get(2);
	
	}

}
