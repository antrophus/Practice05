package com.javaex.ex08;

public class Account {

    private int balance;
    
    //생성자 작성
	public Account(String accountNo) {
		System.out.println(accountNo + "계좌가 개설되었습니다."); 
	}
	
	    //필요한 메소드 작성
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	public void showBalance() {
		System.out.print("잔고액>> " + balance);
		
	}
}
