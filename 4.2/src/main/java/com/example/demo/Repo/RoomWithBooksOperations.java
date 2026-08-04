package com.example.demo.Repo;

import com.example.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.*;

import java.util.List;
/**This class
 * functions as the
 * point where the user Info
 * gets inputted to the database itself
 * and to filter items**/
@Repository
public class RoomWithBooksOperations
{
    @Autowired
    JdbcTemplate operation;

    public Specification<RoomBookEntity> findByWriter(String writer)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("writerName"), writer));
    }

    public void addBooks(RoomBookEntity addABook)
    {
        String add = "INSERT INTO shelves(bookName,writerName,dateBorrowed,dateReturned) VALUES(?,?,?,?)";
        operation.update(add,addABook.getBookName(),addABook.getWriterName(),addABook.getDateBorrowed(),addABook.getDateReturned());
    }

    public void updateBook(RoomBookEntity editBook)
    {
        String update = "UPDATE shelves SET bookName = ?, writerName = ?, dateBorrowed = ?, dateReturned = ? WHERE ID = ?";
        operation.update(update,editBook.getBookName(),editBook.getWriterName(),editBook.getDateBorrowed(),editBook.getDateReturned(),editBook.getID());
    }

    public List<RoomBookEntity> getAllBooks()
    {
        String all = "SELECT * FROM shelves";
        List<RoomBookEntity> allBooks = operation.query(all, new RoomWithBooksRowMapper());
        return allBooks;
    }

    public void deteteBook(int idDelete)
    {
        String delete = "DELETE FROM shelves WHERE ID = ?";
        operation.update(delete,idDelete);
    }
}
