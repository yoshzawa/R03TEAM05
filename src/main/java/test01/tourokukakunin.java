package test01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class OUBO
 */
@WebServlet("/tourokukakunin")
public class tourokukakunin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//final String driverName = "oracle.jdbc.driver.OracleDriver";
		//final String url = "jdbc:mysql://localhost/" + webapp;
		//final String id = "webapp";
		//final String pass = "webapp";
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/webapp","webapp","webapp");
			java.sql.Statement st = connection.createStatement();
			ResultSet result = st.executeQuery("select iconNo,foodName,expryDate,quantity from mst_food");
			
			List<String[]> list = new ArrayList<>();

			while (result.next() == true) {

				// System.out.println(result.getString("X"));
				String[] s = new String[4];
				s[0] = result.getString("iconNo");
				s[1] = result.getString("foodName");
				s[2] = result.getString("expryDate");
				s[3] = result.getString("quantity");

				list.add(s);
			}

			for (String[] s : list) {
				System.out.println(s[0]);
				System.out.println(s[1]);
				System.out.println(s[2]);
				System.out.println(s[3]);

			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/jsp/tourokukakuninn.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}