package com.rest.services.controller;



import com.rest.services.service.ServiceInterface.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
//@RequestMapping("/api/customers")           // base uri
public class MainController
{
    private CustomerService customerService;

    public MainController(CustomerService customerService)
    {
        super();
        this.customerService = customerService;
    }



    @PostMapping("/condition")
    public ResponseEntity<List<Map<String, Object>>>   getCustomersCondition(@RequestBody LinkedHashMap<String, String> body)
    {
        StringBuilder query = new StringBuilder();

        // Get keys and values
//        for (Map.Entry<String, String> entry : body.entrySet()) {
//            String k = entry.getKey();
//            String v = entry.getValue();
//            System.out.println("Key: " + k + ", Value: " + v);
//        }


        // Java 8 - another way to fetch the key-value pair of Map
        body.forEach((k, v) -> {query.append(v+" ");});

        System.out.println(query);

        return new ResponseEntity<List<Map<String, Object>>>(customerService.getCustomersCondition(query.toString().trim()),HttpStatus.OK);
    }

}
