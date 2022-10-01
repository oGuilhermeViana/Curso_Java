package br.com.guilherme.cursojava.exercicio10.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimite;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimite() {
		return withdrawLimite;
	}

	public void setWithdrawLimite(Double withdrawLimite) {
		this.withdrawLimite = withdrawLimite;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
		System.out.println("New Balance: " + String.format("%.2f", getBalance()));		
	}
	
	private void validateWithdraw(double amount) {
		if(amount > getWithdrawLimite()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		}
		if(amount > getBalance()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
}
