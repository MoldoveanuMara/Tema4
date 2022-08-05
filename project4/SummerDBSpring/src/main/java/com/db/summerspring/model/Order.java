package com.db.summerspring.model;

import java.sql.Date;

public class Order {
    private Date order_date;
    private Date shipped_date;
    private String status;

    public Order() {
    }

    public Order(Date order_date, Date shipped_date, String status) {
        this.order_date = order_date;
        this.shipped_date = shipped_date;
        this.status = status;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
