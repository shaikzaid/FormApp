package com.example.FormApp.Repository;

import com.example.FormApp.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepo extends CrudRepository<Product , Long> {

  Iterable<Product> findAll();
}
