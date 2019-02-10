package library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Book book1 = new Book(1,"Grisha","Piter", 1945, 224,
            245,"Cartoon");
	Book book2 = new Book (2, "Sasha","Moscow", 1977, 1984,
            150,"Thread");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);

        Library libraryOne = new Library(books);
        printBookList(libraryOne.getListByAuthor("Andrei"));



    }

    public static void printBookList (List<Book> books){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
}
