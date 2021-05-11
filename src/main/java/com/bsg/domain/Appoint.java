package com.bsg.domain;

import java.util.Date;

/**
 * 预约图书实体
 */
public class Appoint {

    private int book_id;// 图书ID

    private int student_id;// 学号

    private Date appoint_time;// 预约时间

    @Override
    public String toString() {
        return "Appoint{" +
                "book_id=" + book_id +
                ", student_id=" + student_id +
                ", appoint_time=" + appoint_time +
                '}';
    }

    public int getBook_id() {
        return book_id;
    }

    public Appoint() {
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getAppoint_time() {
        return appoint_time;
    }

    public void setAppoint_time(Date appoint_time) {
        this.appoint_time = appoint_time;
    }

    public Appoint(int book_id, int student_id, Date appoint_time) {
        this.book_id = book_id;
        this.student_id = student_id;
        this.appoint_time = appoint_time;
    }
}