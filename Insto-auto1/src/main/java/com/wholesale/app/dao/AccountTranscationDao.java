package com.wholesale.app.dao;

import java.util.List;

import com.wholesale.app.model.AccountTranscation;

public interface AccountTranscationDao {
	List<AccountTranscation> findAllTranscationById(int accountNumber);
}
