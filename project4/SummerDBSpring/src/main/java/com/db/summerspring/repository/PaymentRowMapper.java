package com.db.summerspring.repository;

import com.db.summerspring.model.Payment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentRowMapper implements RowMapper<Payment> {


  @Override
    public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Payment payment = new Payment(rs.getDate("payment_date"),
                        rs.getFloat("amount"));
       return payment;
    }
}
