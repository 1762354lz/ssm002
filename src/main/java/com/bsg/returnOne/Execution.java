package com.bsg.returnOne;

public class Execution {
    private int bookId;

    // 秒杀预约结果状态
    private String state;

    public Execution(int bookId, String state) {
        this.bookId = bookId;
        this.state = state;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Execution{" +
                "bookId=" + bookId +
                ", state=" + state +
                '}';
    }
}
