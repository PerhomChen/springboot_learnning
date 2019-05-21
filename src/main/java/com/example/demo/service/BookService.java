package com.example.demo.service;



import com.example.demo.domain.Book;

import java.util.List;

public interface BookService {

     List<Book> getAllBooks();

     Book getBookById(Integer id);

     void delBookById(Integer id);

     Book saveBook(Book book);

     Book findBook(String name);

     Book findByName(String name);
}
