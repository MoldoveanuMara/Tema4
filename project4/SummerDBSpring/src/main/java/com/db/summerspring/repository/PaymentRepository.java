
package com.db.summerspring.repository;

import com.db.summerspring.model.Customer;
import com.db.summerspring.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
    public class PaymentRepository {
   JdbcTemplate jdbcTemplate;
    @Autowired
    public PaymentRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Payment getByDate (Date payment_date) {
       String statement = "SELECT * FROM payments WHERE payment_date = ?";
     return jdbcTemplate.queryForObject(statement, new PaymentRowMapper(), payment_date);
   }

   public void insertPayment (Payment payment) {
        String statement = "INSERT INTO payments(payment_date, amount) "
               + "VALUES(?,?)" ;
        jdbcTemplate.update(statement, payment.getPayment_date(),
                payment.getAmount());
   }




}




