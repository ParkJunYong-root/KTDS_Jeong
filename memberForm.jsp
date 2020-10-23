<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />     
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>회원 가입창</title>
<body>
<form method="post"   action="${contextPath}/member/addMember.do">
<h1  style="text-align:center">예약신청창</h1>
<table align="center">
	 <tr>
        <td width="200"><p align="right">예약번호</td>
        <td width="400"><p><input type="password"  name="bookNum"></td>
    </tr>
    <tr>
       <td width="200"><p align="right">주차장</td>
       <td width="400"><input type="text" name="park"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">입차일시</td>
        <td width="400"><input type="text"  name="entryDate"></td>
    </tr>
    <tr>
        <td width="200"><p align="right">출차일시</td>
        <td width="400"><p><input type="text"  name="exitDate"></td>
    </tr>
     <tr>
        <td width="200"><p align="right">차량종류</td>
        <td width="400"><p><input type="text"  name="carType"></td>
    </tr>
     <tr>
        <td width="200"><p align="right">차량번호</td>
        <td width="400"><p><input type="text"  name="carNum"></td>
    </tr>
     <tr>
        <td width="200"><p align="right">핸드폰번호</td>
        <td width="400"><p><input type="text"  name="cellNum"></td>
    </tr>
      <tr>
        <td width="200"><p align="right">이메일</td>
        <td width="400"><p><input type="text"  name="email"></td>
    </tr>
      <tr>
        <td width="200"><p align="right">비밀번호</td>
        <td width="400"><p><input type="password"  name="pwd"></td>
    </tr>
      <tr>
        <td width="200"><p align="right">예상금액</td>
        <td width="400"><p><input type="text"  name="price"></td>
    </tr>
    <tr>
        <td width="200"><p>&nbsp;</p></td>
        <td width="400">
	       <input type="submit" value="가입하기">
	       <input type="reset" value="다시입력">
       </td>
    </tr>
</table>
</form>
</body>
</html>
