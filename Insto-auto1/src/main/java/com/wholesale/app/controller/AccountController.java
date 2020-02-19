package com.wholesale.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wholesale.app.model.AccountList;
import com.wholesale.app.model.AccountTranscation;
import com.wholesale.app.service.AccountService;



@RestController
@RequestMapping("/api")
public class AccountController {
    public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
	private AccountService accountService;
    
	public AccountController() {

	}

@RequestMapping(value = "/accountList", method = RequestMethod.GET)
public List<AccountList> getAllAccountList() {
	logger.debug("Inside AccountList Controller Method ");
	return accountService.getAllAccountList();
}

@RequestMapping(value = "/transcationList", method = RequestMethod.GET)
public List<AccountTranscation> getAlltranscationList(@RequestParam("accNum") int accountNumber) {
	logger.debug("Inside TranscationList Controller Method ");
		return accountService.getAllTranscationList( accountNumber);

}

}
