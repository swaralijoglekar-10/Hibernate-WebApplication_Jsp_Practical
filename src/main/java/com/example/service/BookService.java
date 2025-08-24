package com.example.service;


import com.example.dao.BookDAO;
import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    @Transactional
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    @Transactional(readOnly = true)
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    @Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Transactional
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }


    @Transactional
    public void deleteBook(int id) {
        bookDAO.deleteBook(id);
    }
}