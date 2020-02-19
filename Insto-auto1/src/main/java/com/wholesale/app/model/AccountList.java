package com.wholesale.app.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Accountlist")
public class AccountList {
	private int accountNumber;
	private String accountName;
	private String accountType;
	private Date BalanceDate;
	private String Currency;
	private BigDecimal balanceAmount;
	
	@OneToMany(mappedBy="account",cascade = CascadeType.ALL)
	private Set<AccountTranscation> transcations;
	
	public AccountList(int accountNumber, String accountName, String accountType, Date balanceDate, String currency,
			BigDecimal balanceAmount) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		BalanceDate = balanceDate;
		Currency = currency;
		this.balanceAmount = balanceAmount;
	}
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "Account_number")
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
    @Column(name = "Account_name", nullable = false)
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
    @Column(name = "Account_type", nullable = false)
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Column(name = "Balance_date", nullable = false)
	public Date getBalanceDate() {
		return BalanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		BalanceDate = balanceDate;
	}
	@Column(name = "Currency", nullable = false)
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	@Column(name = "Balance_ammount", nullable = false)
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	public Set<AccountTranscation> getTranscations() {
		return transcations;
	}
	public void setTranscations(Set<AccountTranscation> transcations) {
		this.transcations = transcations;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", BalanceDate=" + BalanceDate + ", Currency=" + Currency + ", balanceAmount="
				+ balanceAmount + "]";
	}
	
}
