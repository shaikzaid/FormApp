package com.example.FormApp;

import com.example.FormApp.Service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.touchbit.www.form.urlencoded.marshaller.pojo.FormUrlEncoded;

@RestController
public class FormController {
    @Autowired
    private FormService formService;

    @RequestMapping("/hello")
    public String SayHi(){
        return "hi";
    }
   @GetMapping("/topics")
    public String GetTopics(){
        return "All Topics";
    }
//    @FormUrlEncoded
    @PostMapping("/form")
    public void addProduct(@RequestBody Product product) {
     Product product1=formService.SaveOrUpdate(product);
    }
}
