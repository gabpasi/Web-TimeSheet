package com.timesheet.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="WEB_TICKET")
@Entity
public class Ticket {
	
	
	private Integer idTicket ;
	private String cliente;
	private String sorgenteTicket;
	private String tipologia;
	private Date dataInserimente;
	private Date dataRilascio;
	private String priorità;
	private String statoTicket;
	private Double stima;
	private String descrizione;
	private Date totOreLavorate;
	private String commessa;
	private String note;
	

	
	
	private Set<Dipendente> dipendenti = new HashSet<>();

	
	@ManyToMany(mappedBy = "tickets")
	public Set<Dipendente> getDipendenti() {
		return dipendenti;
	}
	public void setDipendenti(Set<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	@GeneratedValue
	@Id
	public Integer getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getSorgenteTicket() {
		return sorgenteTicket;
	}
	public void setSorgenteTicket(String sorgenteTicket) {
		this.sorgenteTicket = sorgenteTicket;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	@Temporal(TemporalType.DATE)
	public Date getDataInserimente() {
		return dataInserimente;
	}
	public void setDataInserimente(Date dataInserimente) {
		this.dataInserimente = dataInserimente;
	}
	@Temporal(TemporalType.DATE)
	public Date getDataRilascio() {
		return dataRilascio;
	}
	public void setDataRilascio(Date dataRilascio) {
		this.dataRilascio = dataRilascio;
	}
	public String getPriorità() {
		return priorità;
	}
	public void setPriorità(String priorità) {
		this.priorità = priorità;
	}
	public String getStatoTicket() {
		return statoTicket;
	}
	public void setStatoTicket(String statoTicket) {
		this.statoTicket = statoTicket;
	}
	public Double getStima() {
		return stima;
	}
	public void setStima(Double stima) {
		this.stima = stima;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Temporal(TemporalType.TIME)
	public Date getTotOreLavorate() {
		return totOreLavorate;
	}
	public void setTotOreLavorate(Date totOreLavorate) {
		this.totOreLavorate = totOreLavorate;
	}
	public String getCommessa() {
		return commessa;
	}
	public void setCommessa(String commessa) {
		this.commessa = commessa;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
