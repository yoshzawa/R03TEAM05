

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserBean
 */
@WebServlet("/UserBean")
public class UserBean implements Serializable {

	  private String name;
	  private String password;
	  private String address;
	  private String[] product;

	  /** Creates a new instance of UserBean */
	  public UserBean() {
	    name = "No Name";
	    address = "No Address";
	  }

	  public String getaName() {
	    return name;
	  }

	  public void setaName(String na) {
	    name = na;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String ps) {
	    password = ps;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String adr) {
	    address = adr;
	  }

	  public String[] getProduct() {
	    return product;
	  }

	  public void setProduct(String[] product) {
	    this.product = product;
	  }
}
