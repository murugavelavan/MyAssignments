package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lib = new Library();
System.out.println("Introduction to java");
System.out.println(lib.addbook("Book added successfully"));
System.out.println(lib.issuebook());
	}
	String addbook(String booktitle) {
		
		return booktitle;
		
	}
	String issuebook() {
		return "Book issues successfully";
	}

}
