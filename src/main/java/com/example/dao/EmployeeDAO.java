package com.example.dao;

import com.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee); // Handles both insert and update
    }

    @Transactional(readOnly = true)
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.update(employee);
    }

    @Transactional
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employeeToDelete = session.get(Employee.class, id);
        if (employeeToDelete != null) {
            session.delete(employeeToDelete);
        }
    }
}