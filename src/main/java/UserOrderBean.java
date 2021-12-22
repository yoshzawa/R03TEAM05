

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UserOrderBean {

	  /** Creates a new instance of UserOrderBean */
	  public UserOrderBean() {
	  }

	  public boolean execute(UserBean ub) {
	    String[] product = ub.getProduct();

	    //FORM情報が入力されているかチェック
	    if (product == null) {
	      //入力されていない場合
	      ub.setProduct(new String[0]);
	      return false;
	    } else {
	      //入力されている場合
	      return true;
	    }
	  }
	}