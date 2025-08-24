package com.example.dao;

import com.example.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    public User findByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User WHERE username = :username", User.class)
                .setParameter("username", username)
                .uniqueResult();
    }

}