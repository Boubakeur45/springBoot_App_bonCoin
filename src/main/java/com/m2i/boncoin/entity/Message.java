package com.m2i.boncoin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int idAnnonce;
	private int idAchteur;
	private String text;
	private Date dateMessage;
	private int idVendeur;
	

	
	public Message() {
		super();
	}
	
	public Message(int idAnnonce, int idAchteur, int idVendeur, String text, Date dateMessage) {
		super();
		this.idAnnonce = idAnnonce;
		this.idAchteur = idAchteur;
		this.idVendeur = idVendeur;
		this.text = text;
		this.dateMessage = dateMessage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public int getIdAchteur() {
		return idAchteur;
	}
	public void setIdAchteur(int idAchteur) {
		this.idAchteur = idAchteur;
	}
	public int getIdVendeur() {
		return idVendeur;
	}
	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateMessage() {
		return dateMessage;
	}
	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}
	
	
	
	
	
	}
