package com.tutorialspoint.stateless;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Dennis von Bargen
 */
@Remote
public interface LibrarySessionBeanRemote {
    
    void addBook(String bookName);
    
    List getBooks();
}
