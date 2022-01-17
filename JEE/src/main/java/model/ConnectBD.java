package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ConnectBD {
	static final String URL = "jdbc:mysql://localhost:3306/clubsesi";
	static final String Login = "root";
	static final String Password = "";
	static Connection cnx = null;
	//static final int Id=1;
	public static ArrayList<String> tab; 

	public static void init() {
		try {
			cnx = (Connection) DriverManager.getConnection(URL, Login, Password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	public ArrayList<Club> getClubs() throws SQLException{
		cnx = (Connection) DriverManager.getConnection(URL, Login, Password);
		Statement stm = (Statement) cnx.createStatement();
		String sql = "select * from club";
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<Club> liste = new ArrayList<Club>();
		while(rs.next()) {
			liste.add(new Club(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4)));
		}
		return liste;
	}

	public int addAbonne(Abonne a) throws SQLException {
		cnx = (Connection) DriverManager.getConnection(URL, Login, Password);
		Statement stm = (Statement) cnx.createStatement();
		String sql = "insert into abonnement values("+a.getIdClub()+", '"+a.getNom()+"','"+a.getPrénom()+"','"+a.getDateAbonnement() +"')";
       int result =stm.executeUpdate(sql);
       return result;
	}
	
	public ArrayList<Integer> addId() throws SQLException {
		cnx = (Connection) DriverManager.getConnection(URL, Login, Password);
		Statement stm = (Statement) cnx.createStatement();
		String sql = "select idClub from abonnement";
	    ResultSet rs =stm.executeQuery(sql);
		ArrayList<Integer> listeId = new ArrayList<Integer>();
		while(rs.next()) {
			listeId.add(rs.getInt(1));
		}
	    return listeId;
	}
	
	public int suppAbonnement(int id) throws SQLException{
		cnx = (Connection) DriverManager.getConnection(URL, Login, Password);
		Statement stm = (Statement) cnx.createStatement();
		String sql = "delete from abonnement where idClub =("+id+")";
       int result =stm.executeUpdate(sql);
       return result;
	}
	

}

