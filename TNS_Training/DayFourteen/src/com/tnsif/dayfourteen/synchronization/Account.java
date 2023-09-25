package com.tnsif.dayfourteen.synchronization;

public class Account implements Bank {
	
	private int accNo;
	private int balance;
	private String name;

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void deposit(int amount) throws DepositeLimitExceed {
		if(amount>Bank.DEPOSIT_LIMIT)
		{
			throw new DepositeLimitExceed("Can't deposite "+amount+" as banlance limit exceed");
			balance+=amount;
		}
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}

}
