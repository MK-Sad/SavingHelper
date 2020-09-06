package com.monika.SavingHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    Page<AccountTransaction> showAllTransactions(Pageable pageable){
        return accountTransactionService.getAllTransactions(pageable);
    }


}
