package com.wholesale.app.dao;

import java.util.List;

import com.wholesale.app.model.AccountList;


public interface AccountListDao {
	
	List<AccountList> findAllAccountList();
	
}
