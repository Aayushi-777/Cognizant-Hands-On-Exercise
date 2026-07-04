import java.util.Arrays;
import java.util.Comparator;
public class LibrarySearch {
    public static Book linearSearch(Book[] books, String title){
        for(Book book:books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
    public static void sortBooks(Book[] books){
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
    public static Book binarySearch(Book[] books, String title){
        int low=0;
        int high=books.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            int compare=books[mid].getTitle().compareToIgnoreCase(title);
            if(compare==0){
                return books[mid];
            }
            else if(compare<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
    public static void displayBooks(Book[] books){
        System.out.println("BookID\tTitle\t\tAuthor");
        for (Book book:books){
            System.out.println(book.getBookId() + "\t" + book.getTitle() + "\t" + book.getAuthor());
        }
        System.out.println();
    }
}