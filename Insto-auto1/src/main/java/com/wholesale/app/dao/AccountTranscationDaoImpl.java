package com.wholesale.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.wholesale.app.model.AccountTranscation;

@Repository("accountTranscationDao")
public class AccountTranscationDaoImpl implements AccountTranscationDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public List<AccountTranscation> findAllTranscationById(int accountNumber) {
		return entitymanager.createQuery("from AccountTranscation where Account_number = :accountNumber", AccountTranscation.class)
				.setParameter("accountNumber", accountNumber).getResultList();
	}


}
