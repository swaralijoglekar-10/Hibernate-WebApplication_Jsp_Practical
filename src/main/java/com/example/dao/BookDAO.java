package com.example.dao;

import com.example.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book); // Use saveOrUpdate for both new and existing books
    }

    @Transactional(readOnly = true)
    public Book getBookById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }

    @Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book", Book.class).getResultList();
    }

    @Transactional
    public void updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Transactional
    public void deleteBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book bookToDelete = session.get(Book.class, id);
        if (bookToDelete != null) {
            session.delete(bookToDelete);
        }
    }
}
