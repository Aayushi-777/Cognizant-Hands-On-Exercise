package com.cognizant.account_service.controller;
import org.springframework.web.bind.annotation.*;
import com.cognizant.account_service.model.Account;
@RestController
@RequestMapping("/accounts")
public class AccountController {
    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return new Account(
                number,
                "savings",
                234343
        );
    }
}