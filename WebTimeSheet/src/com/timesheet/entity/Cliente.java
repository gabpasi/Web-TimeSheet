package com.timesheet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	//Un cliente pu� avere commissionato pi� lavori(quindi vanno associati pi� IDTicket)
	@Id
	private Integer IdCliente;
	private String nomeCliente;

	
	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	

}
