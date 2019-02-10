package library;

import java.util.ArrayList;
import java.util.List;

public class Library{

    private List<Book> bookList;

    public Library(List<Book> bookList){
        this.bookList = bookList;
    }

    public List<Book> getBookList(){
        return bookList;
    }

    public void setBookList(List<Book> bookList){
        this.bookList=bookList;
    }

    public List<Book> getListByAuthor(String author){
        List<Book> listByAuthor = new ArrayList<Book>();
        for (Book book : bookList){
           if (author.equals(book.getAuthor())){
                listByAuthor.add(book);
            }
        }
        return listByAuthor;
    }

    public List<Book> getListByPublishingHouse (String publishingHouse){
        List<Book> listByPublishingHouse = new ArrayList<Book>();
        for (Book oneBook : bookList){
            if (publishingHouse.equals(oneBook.getPublishingHouse())){
                listByPublishingHouse.add(oneBook);
            }
        }
        return listByPublishingHouse;

    }

    public List<Book> getListAfterYearPublishing (int bookPublishingForSort){
        List<Book> listByYearPublishing = new ArrayList<Book>();
        for (Book oneBook : bookList){
            if (bookPublishingForSort < oneBook.getYearOfPublishing()){
                listByYearPublishing.add(oneBook);
            }
        }
        return listByYearPublishing;
    }
}
