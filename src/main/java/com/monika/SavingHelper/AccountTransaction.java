package com.monika.SavingHelper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class AccountTransaction {

    @Id
    @GeneratedValue
    private Long id;
    private Instant date;
    private String user;
    private int amount;
    private int currentAccountBalance;
    private String category;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAmount(){ return amount; }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    public void setCurrentAccountBalance(int currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
