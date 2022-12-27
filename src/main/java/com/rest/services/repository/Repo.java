package com.rest.services.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class Repo
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> findCustomersLimitedTo(String query)
    {
       return jdbcTemplate.queryForList(query);
    }
}
