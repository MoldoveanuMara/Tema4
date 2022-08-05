package com.db.summerspring.model;


import java.sql.Date;

public class Payment {
    private Date payment_date;
    private float amount;

    public Payment () {}

    public Payment(Date payment_date, float amount) {
        this.payment_date = payment_date;
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


}
