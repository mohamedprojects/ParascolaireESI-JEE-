package model;

import java.sql.Date;

public class Abonne {
	private int idClub;
	private String nom;
	private String pr�nom;
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
	public String getPr�nom() {
		return pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}
	public String getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(String dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	public Abonne(int idClub, String nom, String pr�nom, String date) {
		super();
		this.idClub = idClub;
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.dateAbonnement = date;
	}

}
