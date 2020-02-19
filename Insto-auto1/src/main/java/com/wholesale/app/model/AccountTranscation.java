package com.wholesale.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AccountTranscation")
public class AccountTranscation {

	private int transcationID;
	private int accountNumber;
	private String accountName;	
	private Date valueDate;
	private String currency;
	private BigDecimal debitAmount;
	private BigDecimal creditAmount;
	private String CardType;
	private String TranscationNarrative;
	@ManyToOne
	@JoinColumn(name="Account_number")
    private AccountList account;

	
	public AccountTranscation(int transcationID, int accountNumber, String accountName, Date valueDate, String currency,
			BigDecimal debitAmount, BigDecimal creditAmount, String cardType, String transcationNarrative) {
		super();
		this.transcationID = transcationID;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		CardType = cardType;
		TranscationNarrative = transcationNarrative;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Transcation_id")
	public int getTranscationID() {
		return transcationID;
	}
	
	public void setTranscationID(int transcationID) {
		this.transcationID = transcationID;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	@Column(name = "Account_number", nullable = false)
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	@Column(name = "Account_name", nullable = false)
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Date getValueDate() {
		return valueDate;
	}
	@Column(name = "Value_date", nullable = false)
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	@Column(name = "Currency", nullable = false)
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}
	@Column(name = "Debit_amount")
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}
	@Column(name = "Credit_amount")
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCardType() {
		return CardType;
	}
	@Column(name = "Card_type", nullable = false)
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getTranscationNarrative() {
		return TranscationNarrative;
	}
	@Column(name = "TranscationNarrative")
	public void setTranscationNarrative(String transcationNarrative) {
		TranscationNarrative = transcationNarrative;
	}
	public AccountList getAccount() {
		return account;
	}
	public void setAccount(AccountList account) {
		this.account = account;
	}
	
}
