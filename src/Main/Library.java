package Main;

public class Library {
	// Add the missing implementation to this class
	String Address;
	Book[] books = new Book[4];
	int bookCount = 0;

	Library(String setAddress) {
		Address = setAddress;
	}

	public void addBook(Book newBook) {
		if (bookCount < books.length) {
			books[bookCount] = newBook;
			bookCount++;
		}
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(Address);
	}

	public void borrowBook(String bookName) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getTitle().equals(bookName)) {
				if (!books[i].isBorrowed()) {
					books[i].rented();
					System.out.println("You have succesfully borrowed "
							+ bookName);
				} else {
					System.out
							.println("Sorry, this boook is already borrowed.");
				}
				return;
			}
		}
		System.out.println("Sorry, this book is not in our catalog");
	}

	public void printAvailableBooks() {
		if (bookCount == 0) {
			System.out.println("No books in catalog");
		} else {
			for (int i = 0; i < bookCount; i++) {
				if (!books[i].isBorrowed()) {
					System.out.println(books[i].getTitle());
				}
			}
		}
	}

	public void returnBook(String bookName) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getTitle().equals(bookName)) {
				if (books[i].isBorrowed()) {
					books[i].returned();
					System.out.println("You have succesfully returned "
							+ bookName);
				} else {
					System.out
							.println("Sorry, this is not our book, please try a different location.");
				}
				return;
			}
		}
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}