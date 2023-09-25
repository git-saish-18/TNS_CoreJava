package com.tnsif.dayfourteen.synchronization;

public interface Bank {
	int DEPOSIT_LIMIT=12;
	static final int MINIMUM_BALANCE=1000;
	void deposit(int amount) throws DepositeLimitExceed;
	
	public abstract void withdraw(int amount) throws DepositeLimitExceed;
}
