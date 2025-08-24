package com.example.dao;

import com.example.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    public Customer get(int id) {
        return sessionFactory.getCurrentSession().get(Customer.class, id);
    }
}