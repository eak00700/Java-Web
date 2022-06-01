package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.SawonVO;

public class SawonDAO {
	
	SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//부서목록 조회
	public List<SawonVO> selectList(){
		
		List<SawonVO> list = sqlSession.selectList("s.sawon_list");
		return list;
	}

}
