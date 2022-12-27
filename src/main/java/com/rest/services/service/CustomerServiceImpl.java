package com.rest.services.service;



import com.rest.services.repository.Repo;
import com.rest.services.service.ServiceInterface.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CustomerServiceImpl implements CustomerService
{


  @Autowired
  Repo repo;

    @Override
    public List<Map<String, Object>> getCustomersCondition(String query)
    {
        return repo.findCustomersLimitedTo(query);
    }
}
