package model;

import java.sql.Date;

public class Abonne {
	private int idClub;
	private String nom;
	private String prénom;
	private String dateAbonnement;
	public int getIdClub() {
		return idClub;
	}
	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public String getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(String dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	public Abonne(int idClub, String nom, String prénom, String date) {
		super();
		this.idClub = idClub;
		this.nom = nom;
		this.prénom = prénom;
		this.dateAbonnement = date;
	}

}
