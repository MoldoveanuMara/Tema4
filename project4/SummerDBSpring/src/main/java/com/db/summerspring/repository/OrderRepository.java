package com.db.summerspring.repository;

import com.db.summerspring.model.Customer;
import com.db.summerspring.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
public class OrderRepository {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Order getOrders (String status) {
        String statement = "SELECT * FROM orders WHERE status = ?";
        return jdbcTemplate.queryForObject(statement, new OrderRowMapper(), status);

    }

}



