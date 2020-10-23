<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%> 
<head>
<meta charset="UTF-8">
<title>회원 정보 수정창</title>
<style>
  .cls1 {
     font-size:40px;
     text-align:center;
   }
</style>
</head>
<body>
 <h1 class="cls1">예약 정보 수정창</h1>
<form  method="post" action="${contextPath}/member/modMember.do?id=${memInfo.bookNum}">
 <table align="center" >
   <tr>
     <td width="200"><p align="right" >예약번호</td>
     <td width="400"><input   type="password" name="bookNum" value="${memInfo.bookNum}" disabled ></td>
   </tr>
   <tr>
       <td width="200"><p align="right">주차장</td>
       <td width="400"><input type="text" name="park" value="${memInfo.park}">
       </td>
    </tr>
    <tr>
        <td width="200"><p align="right">입차일시</td>
        <td width="400"><input type="text"  name="entryDate" value="${memInfo.entryDate}">
        </td>
    </tr>
    <tr>
        <td width="200"><p align="right">출차일시</td>
        <td width="400"><p><input type="text"  name="exitDate" value="${memInfo.exitDate}">
        </td>
    </tr>
     <tr>
        <td width="200"><p align="right">차량종류</td>
        <td width="400"><p><input type="text"  name="carType" value="${memInfo.carType}">
        </td>
    </tr>
     <tr>
        <td width="200"><p align="right">차량번호</td>
        <td width="400"><p><input type="text"  name="carNum" value="${memInfo.carNum}">
        </td>
    </tr>
     <tr>
        <td width="200"><p align="right">핸드폰번호</td>
        <td width="400"><p><input type="text"  name="cellNum" value="${memInfo.cellNum}">
        </td>
    </tr>
      <tr>
        <td width="200"><p align="right">비밀번호</td>
        <td width="400"><p><input type="password"  name="pwd" value="${memInfo.pwd}">
        </td>
    </tr>
    <tr>
        <td width="200"><p align="right">예상금액</td>
        <td width="400"><p><input type="text"  name="price" value="${memInfo.price}">
        </td>
    </tr>
    <tr>
        <td width="200"><p align="right">이메일</td>
        <td width="400"><p><input type="text"  name="email" value="${memInfo.email}">
        </td>
    </tr>
   <tr>
     <td width="200"><p align="right" >가입일</td>
     <td width="400"><input   type="text"  name="joinDate" value="${memInfo.joinDate }" disabled></td>
   </tr>
   <tr align="center" >
    <td colspan="2" width="400"><input type="submit" value="수정하기" >
       <input type="reset" value="다시입력" > </td>
   </tr>
 </table>
</form>
</html>
