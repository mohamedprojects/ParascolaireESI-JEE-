package Controller;

import java.io.IOException;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Abonne;
import model.ConnectBD;

/**
 * Servlet implementation class inscriptionController
 */
@WebServlet("/inscriptionController")
public class inscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public inscriptionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idClub = Integer.parseInt(request.getParameter("idClub"));

		request.setAttribute("idClub", idClub);
		request.getRequestDispatcher("/inscription.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idClub = Integer.parseInt(request.getParameter("idClub"));

		String nom = request.getParameter("nom");
		String prénom = request.getParameter("prenom");
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		ConnectBD cnx = new ConnectBD();
		Abonne a = new Abonne(idClub, nom, prénom, date);
		try {
			int result = cnx.addAbonne(a);
			if (result > 0) {
				response.sendRedirect("");
			}
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

}
