package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

/**
 * Servlet implementation class MemberDelAction
 */
@WebServlet("/member_del.do")
public class MemberDelAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//member_del.do?idx=2
		request.setCharacterEncoding("utf-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		int res = UserDAO.getInstance().delete(idx);
		
		String param = "no";
		if( res > 0 ) {
			param = "yes";
		}
		
		//이번에는 json구조가 아닌 param을 그대로 콜백메서드로 전달
		response.getWriter().print(param);
		
	}

}
