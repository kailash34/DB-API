package com.rest.services.service.ServiceInterface;




import java.util.List;
import java.util.Map;


public interface CustomerService
{
        List<Map<String, Object>> getCustomersCondition(String query);
}
