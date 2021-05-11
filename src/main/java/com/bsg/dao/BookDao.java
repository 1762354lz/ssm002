package com.bsg.dao;


import com.bsg.domain.Book;


import java.util.List;

public interface BookDao {
    List<Book> searchAll();

    Book searchOne(int bookId);
    int appoint(int bookId);

}
