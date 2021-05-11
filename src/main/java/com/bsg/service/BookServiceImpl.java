package com.bsg.service;

import com.bsg.dao.AppointDao;
import com.bsg.dao.BookDao;
import com.bsg.domain.Appoint;
import com.bsg.domain.Book;
import com.bsg.exception.AppointException;
import com.bsg.returnOne.Execution;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;
    @Resource
    private AppointDao appointDao;
    @Override
    public List<Book> searchAll() {
       List<Book> books= bookDao.searchAll();
        return books;
    }

    @Override
    public Book searchOne(int bookId) {
        Book book= bookDao.searchOne(bookId);
        return book;
    }

    @Override
    public Execution appoint(int bookId,int personId) {


      Appoint appoint= appointDao.find(bookId,personId);
      if(appoint!=null)
          throw new AppointException("您已经借过此书");
        int record =bookDao.appoint(bookId);
        if (record<=0)
            throw new AppointException("书没有了");
                int num=appointDao.add(bookId,personId);
        return new Execution(bookId,"借走一本");
    }
}
