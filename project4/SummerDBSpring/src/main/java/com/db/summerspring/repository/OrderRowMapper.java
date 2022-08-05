package com.db.summerspring.repository;

import com.db.summerspring.model.Order;
import com.db.summerspring.model.Payment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {

        Order order = new Order(rs.getDate("order_date"),
                rs.getDate("shipped_date"),
                rs.getString("status"));
        return order;
    }
}


