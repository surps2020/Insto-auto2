package com.wholesale.app.service;


import java.util.List;

import com.wholesale.app.model.AccountList;
import com.wholesale.app.model.AccountTranscation;

public interface AccountService {
	List<AccountList> getAllAccountList();
	List<AccountTranscation> getAllTranscationList(int accountNumber);
}
