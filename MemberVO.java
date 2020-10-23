package ex01;

import java.sql.Date;

public class MemberVO {
	private String bookNum;
	private String park;
	private String entryDate;
	private String exitDate;
	private String carType;
	private String carNum;
	private String cellNum;
	private String email;
	private String pwd;
	private String price;
	private Date joinDate;
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}
	
	public MemberVO(String bookNum, String park, String entryDate, String exitDate, String carType,
			String carNum, String cellNum, String email,String pwd,String price) {
		super();
		this.bookNum = bookNum;
		this.park = park;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.carType = carType;
		this.carNum = carNum;
		this.cellNum = cellNum;
		this.email = email;
		this.pwd = pwd;
		this.price = price;
		
	}
	
	public MemberVO(String bookNum, String park, String entryDate, String exitDate, String carType,
			String carNum, String cellNum, String email,String pwd,String price,Date joinDate) {
		super();
		this.bookNum = bookNum;
		this.park = park;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.carType = carType;
		this.carNum = carNum;
		this.cellNum = cellNum;
		this.email = email;
		this.pwd = pwd;
		this.price = price;
		this.joinDate = joinDate;
		
	}


	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getExitDate() {
		return exitDate;
	}

	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	
	public String getCellNum() {
		return cellNum;
	}

	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
