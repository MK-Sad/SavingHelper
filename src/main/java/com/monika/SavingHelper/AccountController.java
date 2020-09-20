package com.monika.SavingHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountTransactionService accountTransactionService;

    @GetMapping("accountBalance/user/{user}")
    Account showAccountBalance(@PathVariable String user){
        return accountTransactionService.getAccountBalanceByUser(user);
    }

    @PostMapping("accountBalance/transaction")
    AccountTransaction addTransaction(@RequestBody AccountTransaction accountTransaction){
        return accountTransactionService.addTransaction(accountTransaction);
    }

    @GetMapping("accountBalance/transactions")
    List<AccountTransaction> showAllTransactions(){
        return accountTransactionService.getAllTransactions();
    }

    @GetMapping("accountBalance/transactions/category/{category}")
    List<AccountTransaction> showTransactionByCategory(@PathVariable String category){
        return accountTransactionService.getTransactionByCategory(category);
    }

    @GetMapping("account/transactions/{year}/{month}")
    List<AccountTransaction> showTransactionsForYearAndMonth(@PathVariable int year, @PathVariable int month){
        return accountTransactionService.getTransactionsForYearAndMonth(year, month);
    }


}
