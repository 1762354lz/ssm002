package com.bsg.dao;

import com.bsg.domain.Appoint;
import org.apache.ibatis.annotations.Param;

public interface AppointDao {
    Appoint find(@Param("bookid") int bookId, @Param("personid") int personId);
   int add(@Param("bookid") int bookId, @Param("personid") int personId);
}
