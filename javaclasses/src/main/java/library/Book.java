package library;

public class Book {
    private int identificationNumber;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int priceOfBook;
    private String bindigType;

    public Book(int identificationNumber, String author, String publishingHouse, int yearOfPublishing, int numberOfPages,
                int priceOfBook, String bindigType){
        this.identificationNumber = identificationNumber;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this. priceOfBook = priceOfBook;
        this.bindigType = bindigType;
    }

    public int getIdentificationNumber(){
        return identificationNumber;
    }
     public void setIdentificationNumber(int identificationNumber){
        this.identificationNumber=identificationNumber;
     }

     public int getYearOfPublishing(){
        return yearOfPublishing;
     }

     public void setYearOfPublishing (int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
     }

     public String getAuthor(){
        return author;
     }

     public void setAuthor(String author){
        this.author=author;
     }

     public String getPublishingHouse(){
        return publishingHouse;
     }

     public void setPublishingHouse(String publishingHouse){
        this.publishingHouse=publishingHouse;
     }

     public int getNumberOfPages(){
        return numberOfPages;
     }

     public void setNumberOfPages(){
        this.numberOfPages = numberOfPages;
     }

     public int getPriceOfBook(){
        return priceOfBook;
     }

     public void setPriceOfBook(){
        this.priceOfBook=priceOfBook;
     }

     @Override
    public String toString(){
        return "Book [id=" + identificationNumber + ", author=" + author + ", Publishing House" + publishingHouse +
                ", year of publishing="+ yearOfPublishing + ", number of pages" + numberOfPages + " ] ";
     }
}