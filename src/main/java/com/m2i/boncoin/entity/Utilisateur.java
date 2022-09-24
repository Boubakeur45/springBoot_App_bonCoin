package com.m2i.boncoin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	
	
	
	
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, String telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
