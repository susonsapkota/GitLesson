
package com.itn.libraryclass.entity;


public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;
    private boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, String publisher, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }

    

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + ", status=" + status + '}';
    }

    
    
    
    
    
}
