package com.maen.ma.model.dao;

import com.maen.ma.model.entities.Customer;
import org.springframework.data.repository.CrudRepository;

//Metodos CRUD.
public interface CustomerDAO extends CrudRepository<Customer, Long> {
}
