package br.com.guilherme.cursojava.exercicio13.Services;

import java.util.Calendar;
import java.util.Date;

import br.com.guilherme.cursojava.exercicio13.entities.Contract;
import br.com.guilherme.cursojava.exercicio13.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i); 
			
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			Date dueDate = addMonths(contract.getDate(), i);
			
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, N);
		return c.getTime();
		
	}
	
}
