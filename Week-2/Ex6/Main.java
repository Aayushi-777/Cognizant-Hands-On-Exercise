public class Main {
    public static void main(String[] args){
        Book[] books={
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Galvin"),
                new Book(104, "Computer Networks", "Andrew Tanenbaum"),
                new Book(105, "Database Systems", "Elmasri")
        };
        System.out.println("AVAILABLE BOOKS");
        LibrarySearch.displayBooks(books);
        System.out.println("LINEAR SEARCH");
        Book result=LibrarySearch.linearSearch(books, "Operating Systems");
        if (result!=null)
            result.display();
        else
            System.out.println("Book Not Found");
        LibrarySearch.sortBooks(books);
        System.out.println("BOOKS AFTER SORTING");
        LibrarySearch.displayBooks(books);
        System.out.println("BINARY SEARCH");
        result=LibrarySearch.binarySearch(books, "Operating Systems");
        if (result!=null)
            result.display();
        else
            System.out.println("Book Not Found");
    }
}
