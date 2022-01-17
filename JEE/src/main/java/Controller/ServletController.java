package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Club;
import model.ConnectBD;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// regrouper l'ensemble des clubs dans une liste

		ConnectBD.init();
		ConnectBD cnx = new ConnectBD();
		ArrayList<Club> liste;

		try {
			liste = cnx.getClubs();
			request.setAttribute("ListeClub", liste);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// regrouper l'ensemble des Ids de clubs qui l'utilisateur est déjà s'inscrit dans une liste
		ArrayList<Integer> listeId = new ArrayList<Integer>();
		try {
			listeId = cnx.addId();
			request.setAttribute("listeId", listeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
