package com.tutorialspoint.stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Dennis von Bargen
 */
@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {

    List<String> bookShelf;
    
    public LibrarySessionBean() {
        bookShelf = new ArrayList<String>();
    }
    
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }
    
    public List<String> getBooks() {
        return bookShelf;
    }
}
