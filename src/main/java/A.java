
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import java.io.IOException;
//import java.sql.Connection;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.sql.DriverManager;

/**
 * Servlet implementation class A
 */
@WebServlet("/A")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.222:1521/pdborcl";
		final String id = "OUBO";
		final String pass = "Oubo2021";

		try {
			Class.forName(driverName);
			Connection connection=DriverManager.getConnection(url,id,pass);
			PreparedStatement st =
					connection.prepareStatement(
							"select NumA,NumB,eMail from OUBO"
						);
			ResultSet result = st.executeQuery();

			List<String[]> list = new ArrayList<>();
			while( result.next() == true) {
				String[] s = new String[3];				
				
				s[0]=result.getString("NumA");
				s[1]=result.getString("NumB");
				s[2]=result.getString("eMail");			
				
				list.add(s);
				//System.out.println(result.getString("X"));
				}
				for(String[] s : list) {
					System.out.println(s[0]);
					System.out.println(s[1]);
					System.out.println(s[2]);
				}
				
				
				//String value1=request.getParameter("value1");
				request.setAttribute("list", list);
				request.getRequestDispatcher("/A.jsp")
				.forward(request, response);
				
				
			
		} catch (ClassNotFoundException e ) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e ) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
