package week2.day1;

public class Library {

	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
    System.out.println("Book added successfully");
    return(bookTitle);
	}
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book=new Library();
		book.issueBook();
		String bookTitle=book.addBook("The Motor cycle diaries");
		System.out.println(bookTitle);
	}

}
