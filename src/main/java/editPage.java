import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editPage
 */
@WebServlet("/editPage")
public class editPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//DB接続に必要なやつ
		final String driverName="あとで入れます";
		final String url="あとで(ry";
		final String id="あとで(ry";
		final String pass="あとで(ry";
		
//いつも書いてるやつ
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		try {
//DB接続
		Class.forName(driverName);
		Connection conn=DriverManager.getConnection(url,id,pass);
		PreparedStatement st=conn.prepareStatement(
				"select iconNo,foodName,expryDate,quantity from mst_food"
				);
		ResultSet result=st.executeQuery();
		
		List<String[]>list=new ArrayList<>();
		while(result.next()==true) {
			String[] s=new String[4];
			s[0]=result.getString("iconNo");
			s[1]=result.getString("foodName");
			s[2]=result.getString("expryDate");
			s[3]=result.getString("quantity");
			list.add(s);
		}
		
		for(String[] s:list) {
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s[2]);
			System.out.println(s[3]);
		}
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/jsp/editPage.jsp");
		}catch(Exception e) {
			e.printStackTrace(out);
		}
	}
}
