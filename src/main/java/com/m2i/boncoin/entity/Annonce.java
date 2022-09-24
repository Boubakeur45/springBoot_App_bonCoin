package com.m2i.boncoin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annonce {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titre;
	private String description;
	private int idUtilisateur;
	private int prix;
	private Date datePublication;
	
	
	
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Annonce(String titre, String description, int idUtilisateur, int prix, Date datePublication) {
		super();
		this.titre = titre;
		this.description = description;
		this.idUtilisateur = idUtilisateur;
		this.prix = prix;
		this.datePublication = datePublication;
	
	
	
	

}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
}
