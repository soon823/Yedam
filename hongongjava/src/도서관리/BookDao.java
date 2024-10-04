package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {
	
		//필드
		//메소드
		//1.연결설정 메소드

		Connection conn = null;
		public void getOpen() {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"java",
						"1234"
						);
				System.out.println("연결하기");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
			
		//2.연결끊기 메소드

		public void getClose() {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//3.insert 메소드
		
		public int insert(Book book) {
			getOpen();
			
			String sql = "" 
						+ "insert into boards (title,writer,bnum,price) "
						+ "values(?, ?, ?, ?)";
			
			PreparedStatement pstmt;
			try {
				pstmt.setString(1, book.getTitle());
				pstmt.setString(2, book.getWriter());
				pstmt.setString(3, book.getBum());
				pstmt.setInt(4, book.getPrice());
				
				int rows = pstmt.executeUpdate();
				return rows;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			getClose();
			return 0;
		}
		
		//4.select 조건에 따른 검색(책 제목) 메소드
		//5.select 목록전체 조회 메소드
		//6.delete 메소드(북번호 이용)
		//7.update 메소드(책 제목의 가격과 책 번호 수정)
		
}

