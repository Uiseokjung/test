package db;

import java.sql.*;

public class MemberDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	MemberDAO(){
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",
					"root",
					"java1234"
					);
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// self test
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		vo.setMemberSeq(6);
		vo.setMemberId("ehofhe");
		vo.setMemberName("Abdula");
		//int res = dao.insert(vo);
		//System.out.println(res + "건이 처리되었습니다.");
		vo.setMemberName("Abdula jr.");
		//int res = dao.update(vo);
		//dao.delete(6);
		vo = dao.select(6);
		System.out.println(vo.getMemberSeq() + " " + vo.getMemberId() + " " + vo.getMemberName());
	}
	
	public int insert(MemberVO vo) {
		int seq = vo.getMemberSeq();
		String id = vo.getMemberId();
		String name = vo.getMemberName();
		
		String sql = "INSERT INTO member VALUES(" + seq + ", '" + id + "', '" + name + "');";
		System.out.println(sql);
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int update(MemberVO vo) {
		int seq = vo.getMemberSeq();
		String id = vo.getMemberId();
		String name = vo.getMemberName();
		
		String sql = "UPDATE member SET " + 
		             "seq = " + seq + ", " +
		             "id = '" + id + "', " +
		             "name = '" + name + "' " +
		             "WHERE seq = " + seq +
				     ";";
		System.out.println(sql);
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(int seq) {	
		String sql = "DELETE FROM member " + 
		             "WHERE seq = " + seq +
				     ";";
		System.out.println(sql);
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public MemberVO select(int seq) {	
		String sql = "SELECT * FROM member " + 
		             "WHERE seq = " + seq +
				     ";";
		System.out.println(sql);
		MemberVO vo = new MemberVO();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				vo.setMemberSeq(rs.getInt("seq"));
				vo.setMemberId(rs.getString("id"));
				vo.setMemberName(rs.getString("name"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
}








