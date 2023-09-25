package com.tnsif.dayfourteen.synchronization;

public class InsufficientBalanceException extends Executor {
	public InsufficientBalanceException()
	{
		super("Can't Withdraw money");
	}
}
