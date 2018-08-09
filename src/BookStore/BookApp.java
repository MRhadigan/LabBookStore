/**
 * 
 */
package BookStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Matthew Rhadigan
 *
 */
public class BookApp {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		ArrayList<Book> data = new ArrayList<>();
//		System.out.println("How many books would you like to enter?");
//		int userInput = scan.nextInt();
//		scan.nextLine();
//		
//		String isbn;
//		String author;
//		String title;
//		double price;
//		
//		for(int i = 0; i < userInput; i++) {
//			System.out.println("Please enter the author of the book");
//			author = scan.nextLine();
//			System.out.println("Please enter the title of the book");
//			title = scan.nextLine();
//			System.out.println("Please enter the price of the book");
//			price = scan.nextDouble();
//			System.out.println("Please enter the ISBN on the back of the book");
//			isbn = scan.nextLine();
//			scan.nextLine();
//			
//			data.add(new Book(isbn, author, title, price));
//		}
//		
//		System.out.println("Book List! ");
//		for(Book list: data) {
//			System.out.println(list);
		//}
		
		System.out.println("Used Book List");
		System.out.println(UsedBook.used());
		
		
		System.out.println("New Book List");
		System.out.println(UsedBook.newBook());
	}

}
