package model;

import java.sql.Date;

public class Club {
	private int idClub;
	private String nomClub;
	private String nomPresident;
	private Date dateCreation;
	public int getIdClub() {
		return idClub;
	}
	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	public String getNomPresident() {
		return nomPresident;
	}
	public void setNomPresident(String nomPresident) {
		this.nomPresident = nomPresident;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Club(int idClub, String nomClub, String nomPresident, Date dateCreation) {
		super();
		this.idClub = idClub;
		this.nomClub = nomClub;
		this.nomPresident = nomPresident;
		this.dateCreation = dateCreation;
	}

}
