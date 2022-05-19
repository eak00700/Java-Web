package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import vo.UserVO;

/**
 * Servlet implementation class MemberListAction
 */
@WebServlet("/member_list.do")
public class MemberListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원목록 모두 가져오기
		List<UserVO> list = UserDAO.getInstance().selectList();
		
		//list를 스코프에 바인딩
		request.setAttribute("list", list);
		//포워딩
		RequestDispatcher disp = 
				request.getRequestDispatcher("member_list.jsp");
		disp.forward(request, response);
		
	}

}
