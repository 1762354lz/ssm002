package com.bsg.service;


import com.bsg.domain.Book;
import com.bsg.returnOne.Execution;

import java.util.List;

public interface BookService {
    List<Book> searchAll();

    Book searchOne(int bookId);

    Execution appoint(int id,int personId);
}
