package com.example.demo.Entity;

import jakarta.persistence.*;
/**
 * This class stores
 * all the program's
 * variables and
 * general information
 * **/
@Entity
@Table(name = "shelves")
public class RoomBookEntity
{
    @Column(name = "bookName")
    private String bookName;
    @Column(name ="writerName")
    private String writerName;
    @Column(name = "dateBorrowed")
    private String dateBorrowed;
    @Column(name = "dateReturned")
    private String dateReturned;
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public String getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(String dateReturned) {
        this.dateReturned = dateReturned;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
}
