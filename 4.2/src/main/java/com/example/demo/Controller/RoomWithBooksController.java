package com.example.demo.Controller;

import com.example.demo.Repo.RoomWithBooksOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.*;
import com.example.demo.*;
import com.example.demo.Repo.*;

import java.util.List;
/**
 * This page is for
 * the operations that will
 * be done by the program itelf
 * like the CRUD and
 * special functions
 * **/
@RestController
@Service
@RequestMapping("/library")

public class RoomWithBooksController
{
    @Autowired
    RoomWithBooksOperations operations;

    @Autowired
    DynamicFilterForRoomWIthBooks books;


    /*
    * This function allows the program
    * to output only the items
    * with that particular writer
    * in it*/
    @GetMapping("/writer")
    public List<RoomBookEntity> writerSearch(@RequestParam String writer)
    {
        Specification<RoomBookEntity> spec = operations.findByWriter(writer);

        return  books.findAll(spec);
    }


    @GetMapping("/allBooks")
    public List<RoomBookEntity> allBooks()
    {
        return operations.getAllBooks();
    }

    @PostMapping("/insertBooks")
    public void addBooks(@RequestBody RoomBookEntity insert)
    {
        operations.addBooks(insert);
    }

    @PutMapping("/editBooks")
    public void editBooks(@RequestBody RoomBookEntity change)
    {
        operations.updateBook(change);
    }

    @DeleteMapping("/deleteBooks/{bookdelete}")
    public void deleteBook(@PathVariable("bookdelete") int delete)
    {
        operations.deteteBook(delete);
    }
}
