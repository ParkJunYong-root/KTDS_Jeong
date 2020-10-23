package ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAO {
		private Connection conn;
		private PreparedStatement pstmt;
		private DataSource dataFactory;
		
		public MemberDAO() {
			try {
				Context ctx = new InitialContext();
				Context envContext = (Context) ctx.lookup("java:/comp/env");
				dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		public List<MemberVO> listMembers(){
			List<MemberVO> membersList = new ArrayList();
			try {
				conn = dataFactory.getConnection();
				String query = "select * from a_member order by joinDate desc";
				System.out.println(query);
				pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();
				System.out.println("!1");
				while(rs.next()) {
					String bookNum = rs.getString("bookNum");
					String park = rs.getString("park");
					String entryDate = rs.getString("entryDate");
					String exitDate = rs.getString("exitDate");
					String carType = rs.getString("carType");
					String carNum = rs.getString("carNum");
					String cellNum = rs.getString("cellNum");					
					String email = rs.getString("email");
					String pwd = rs.getString("pwd");
					String price = rs.getString("price");
					Date joinDate = rs.getDate("joinDate");
					
					System.out.println("book이름: " + rs.getString("bookNum"));
					
					MemberVO memberVo = new MemberVO(bookNum, park, entryDate, exitDate, carType, carNum, cellNum, email, pwd, price, joinDate);
					
					membersList.add(memberVo);
				}
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return membersList;
		}
		public void addMember(MemberVO m) {
			try {
				conn = dataFactory.getConnection();
				String bookNum = m.getBookNum();
				String park = m.getPark();
				String entryDate = m.getEntryDate();
				String exitDate = m.getExitDate();
				String carType = m.getCarType();
				String carNum = m.getCarNum();
				String cellNum = m.getCellNum();	
				String email = m.getEmail();
				String pwd = m.getPwd();
				String price = m.getPrice();
				String query = "insert into a_member(bookNum, park, entryDate, exitDate, carType, carNum, cellNum, email, pwd, price)" + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				System.out.println(query);
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, bookNum);
				pstmt.setString(2, park);
				pstmt.setString(3, entryDate);
				pstmt.setString(4, exitDate);
				pstmt.setString(5, carType);
				pstmt.setString(6, carNum);
				pstmt.setString(7, cellNum);
				pstmt.setString(8, email);
				pstmt.setString(9, pwd);
				pstmt.setString(10, price);
				pstmt.executeUpdate();
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void delMember(String bookNum) {
			try {
				conn = dataFactory.getConnection();
				String query = "delete from a_member" + " where bookNum=?";
				System.out.println("prepareStatement : " + query);
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1,bookNum);
				pstmt.executeUpdate();
				pstmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
			
		}
		public MemberVO findMember(String _bookNum) {
				MemberVO memInfo = null;
				try {
					conn=dataFactory.getConnection();
					String query = "select * from a_member where bookNum=?";
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, _bookNum);
					System.out.println(query);
					ResultSet rs = pstmt.executeQuery();
					rs.next();
					String bookNum = rs.getString("bookNum");
					String park = rs.getString("park");
					String entryDate = rs.getString("entryDate");
					String exitDate = rs.getString("exitDate");
					String carType = rs.getString("carType");
					String carNum = rs.getString("carNum");
					String cellNum = rs.getString("cellNum");
					String email = rs.getString("email");
					String pwd = rs.getString("pwd");
					String price = rs.getString("price");
					Date joinDate = rs.getDate("joinDate");
					memInfo = new MemberVO(bookNum, park, entryDate, exitDate, carType, carNum, cellNum, email, pwd, price, joinDate);
					pstmt.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return memInfo;
		}
		public void modMember (MemberVO memberVO) {
			String bookNum = memberVO.getBookNum();
			String park = memberVO.getPark();
			String entryDate = memberVO.getEntryDate();
			String exitDate = memberVO.getExitDate();
			String carType = memberVO.getCarType();
			String carNum = memberVO.getCarNum();
			String cellNum = memberVO.getCellNum();
			String email = memberVO.getEmail();
			String pwd = memberVO.getPwd();
			String price = memberVO.getPrice();
			try {
				conn = dataFactory.getConnection();
				String query = "update a_member set park=?,entryDate=?,exitDate=?,carType=?,carNum=?,cellNum?,email=?,pwd=?,price=? where bookNum=?";
				System.out.println(query);
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, park);
				pstmt.setString(2, entryDate);
				pstmt.setString(3, exitDate);
				pstmt.setString(4, carType);
				pstmt.setString(5, carNum);
				pstmt.setString(6, cellNum);
				pstmt.setString(7, email);
				pstmt.setString(8, pwd);
				pstmt.setString(9, price);
				pstmt.setString(10, bookNum);
				pstmt.executeUpdate();
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
