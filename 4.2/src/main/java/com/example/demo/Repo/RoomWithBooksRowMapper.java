package com.example.demo.Repo;
import com.example.demo.*;
import com.example.demo.Entity.RoomBookEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * This is where the
 * user input gets encapsulated to
 * the variables**/
public class RoomWithBooksRowMapper implements RowMapper<RoomBookEntity>
{

    @Override
    public RoomBookEntity mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        RoomBookEntity roomBook = new RoomBookEntity();

        roomBook.setID(rs.getInt("ID"));
        roomBook.setBookName(rs.getString("bookName"));
        roomBook.setWriterName(rs.getString("writerName"));
        roomBook.setDateBorrowed(rs.getString("dateBorrowed"));
        roomBook.setDateReturned(rs.getString("dateReturned"));
        return roomBook;
    }
}
