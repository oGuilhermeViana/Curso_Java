package br.com.guilherme.cursojava.exercicio13.Services;

public interface OnlinePaymentService {
	public double paymentFee(double amount);
	public double interest(double amount, int months);
}