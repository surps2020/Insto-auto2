package com.wholesale.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wholesale.app.dao.AccountListDao;
import com.wholesale.app.dao.AccountTranscationDao;
import com.wholesale.app.model.AccountList;
import com.wholesale.app.model.AccountTranscation;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountListDao accountListDao;
	@Autowired
	private AccountTranscationDao accountTranscationDao;
	

	public List<AccountList> getAllAccountList() {
		return accountListDao.findAllAccountList();

	}

	@Override
	public List<AccountTranscation> getAllTranscationList(int accountNumber) {
		return accountTranscationDao.findAllTranscationById(accountNumber);

	}

}
