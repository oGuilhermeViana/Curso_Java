package br.com.guilherme.cursojava.exercicio04.entities;

import java.util.Date;

public class HourContract {
	
	private Double valuePerHour;
	private Date date;
	private Integer hours;
	
	public HourContract(Double valuePerHour, Date date, Integer hours) {
		this.valuePerHour = valuePerHour;
		this.date = date;
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double totalValue() {
		return hours * valuePerHour;
	}
}
