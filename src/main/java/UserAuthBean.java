

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAuthBean {

	  /** Creates a new instance of UserAuthBean */
	  public UserAuthBean() {
	  }

	  public boolean execute(UserBean ub) {
	    if (ub.getaName().equals("taro") == true && ub.getPassword().equals("taro") == true) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	}