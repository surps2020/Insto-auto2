package com.wholesale.app.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.wholesale.app.model.AccountList;

@Repository
public class AccountListDaoImpl implements AccountListDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	
	public List<AccountList> findAllAccountList() {
		return entitymanager.createQuery("from Accountlist", AccountList.class).getResultList();
	}

}
