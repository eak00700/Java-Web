package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadAction
 */
//@webservlet : url매핑 - jsp등에서 현재 서블릿을 요청할 수 있는 식별자를 지정하는 영역
@WebServlet("/upload.do")
public class FileUploadAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request,//요청처리객세 
						   HttpServletResponse response)//응답처리객체 
								   throws ServletException, IOException {
		//매핑이 호출되면 가장먼저 실행되는 메서드
		System.out.println("서블릿 접속 됨");
		
		request.setCharacterEncoding("utf-8");
		
		//파일업로드(multipart/form-data)
		String path="c:/upload";
		int max_size = 1024 * 1024 * 100;
		
		//파일을 포함한 파라미터를 수신하기 위한 객체
		MultipartRequest mr = new MultipartRequest(
				request, //request정보를 위임 
				path, //업로드 경로
				max_size, //최대 업로드 용량
				"utf-8",//수신 인코딩 타입
				new DefaultFileRenamePolicy());//중복된 파일명을 알아서 변경
		
				RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
				disp.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
