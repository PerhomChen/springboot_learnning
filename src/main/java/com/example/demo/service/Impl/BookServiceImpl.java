package com.example.demo.service.Impl;

import com.example.demo.domain.Book;
import com.example.demo.repository.IBookRepository;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Integer id) {
        Optional<Book> oBook = bookRepository.findById(id);
        if(oBook.isPresent()) {
            return oBook.get();
        } else {
            return null;
        }
    }

    @Override
    public void delBookById(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findBook(String name) {
        return bookRepository.findBook(name);
    }

    @Override
    public Book findByName(String name) {
        return bookRepository.findByName(name);
    }


}