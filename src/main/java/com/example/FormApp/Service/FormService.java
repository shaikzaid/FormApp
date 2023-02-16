package com.example.FormApp.Service;

import com.example.FormApp.Product;
import com.example.FormApp.Repository.FormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
     @Autowired
    private FormRepo formRepo;



  public Product SaveOrUpdate(Product product){return formRepo.save(product);
  }
}
