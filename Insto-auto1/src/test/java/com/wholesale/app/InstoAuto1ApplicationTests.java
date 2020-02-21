package com.wholesale.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.wholesale.app.dao.AccountListDao;
import com.wholesale.app.model.AccountList;
import com.wholesale.app.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstoAuto1ApplicationTests {
	
	AccountService accountService;

	@MockBean
	private AccountListDao accountListDao;
	
	@SuppressWarnings("deprecation")
	@Test
	public void getAccountListTest()
	{
		when(accountListDao.findAllAccountList()).thenReturn(Stream.of(new AccountList(585309209, "SGSavings726", "Saving", new Date(2000, 11, 21), "SGD", new BigDecimal("110.03")),new AccountList(791066619, "AUSavings933", "Saving", new Date(2000, 11, 21), "SGD", new BigDecimal("220.03"))).collect(Collectors.toList()));
		assertEquals(2, accountService.getAllAccountList().size());
	}

}
