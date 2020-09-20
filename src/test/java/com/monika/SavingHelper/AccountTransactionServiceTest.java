package com.monika.SavingHelper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTransactionServiceTest {

    @Test
    void getTransactionsForYearAndMonth() {
        AccountTransactionService accountTransactionService = new AccountTransactionService();
        accountTransactionService.getTransactionsForYearAndMonth(2020,10);
        //TODO Assertions
    }
}