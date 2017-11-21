
package com.itn.libraryclass.Dao;

import com.itn.libraryclass.entity.Book;
import java.util.ArrayList;
import java.util.List;


public class BookDaoImpl implements BookDao{

    @Override
    public List<Book> getAll() {
        List<Book> booklist = new ArrayList();
        booklist.add(new Book(1, "As I Lay Dying", "William Faulkner", "Vintage", true));
        booklist.add(new Book(2, "Ulysses", "James Joyce", "anonymous2", false));
        booklist.add(new Book(3, "Pale Fire", "Vladimir Nabokov", "Vintage", true));
        booklist.add(new Book(4, "And Then There Were None", "Agatha Cristie", "anonymous3", false));
        return booklist;
    }
    
}
