<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />  
<%
request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
<c:choose>
   <c:when test='${msg=="addMember" }'>
      <script>
         window.onload=function(){
            alert("예약을 등록했습니다.");
         }
      </script>
   </c:when>
   <c:when test='${msg=="modified" }'>
      <script>
        window.onload=function(){
          alert("예약 정보를 수정했습니다.");
        }
      </script>
   </c:when>
   <c:when test= '${msg=="deleted" }'>
      <script>
         window.onload=function(){
            alert("예약 정보를 삭제했습니다.");
        } 
      </script>
</c:when>
</c:choose>

   <meta  charset="UTF-8">
   <title>예약 정보 출력창</title>
<style>
     .cls1 {
       font-size:40px;
       text-align:center;
     }
    
     .cls2 {
       font-size:20px;
       text-align:center;
     }
  </style>
  
</head>
<body>
 <p class="cls1">예약신청</p>
   <table align="center" border="1" >
      <tr align="center" bgcolor="green">
      	<td width="8%" ><b>예약번호</b></td>
         <td width="8%" ><b>주차장</b></td>
         <td width="8%" ><b>입차일시</b></td>
         <td width="8%" ><b>출차일시</b></td>
         <td width="8%"><b>차량종류</b></td>
         <td width="8%" ><b>차량번호</b></td>
         <td width="8%" ><b>핸드폰번호</b></td>
		 <td width="8%" ><b>이메일</b></td>
		 <td width="8%" ><b>비밀번호</b></td>
		 <td width="8%" ><b>예상금액</b></td>
		 <td width="8%" ><b>가입일</b></td>
         <td width="8%" ><b>수정</b></td>
		 <td width="9%" ><b>삭제</b></td>
   </tr>

<c:choose>
    <c:when test="${membersList==null}" >
      <tr>
        <td colspan=5>
          <b>등록된 예약이 없습니다.</b>
       </td>  
      </tr>
   </c:when>  
   <c:when test="${membersList != null }" >
      <c:forEach  var="mem" items="${membersList}" >
        <tr align="center">
          <td>${mem.bookNum }</td>   	
          <td>${mem.park }</td>
          <td>${mem.entryDate }</td>
          <td>${mem.exitDate}</td>     
          <td>${mem.carType }</td>     
          <td>${mem.carNum }</td>     
          <td>${mem.cellNum }</td>
          <td>${mem.email }</td>        
          <td>${mem.pwd }</td>     
          <td>${mem.price }</td>         
          <td>${mem.joinDate}</td>
          <td><a href="${contextPath}/member/modMemberForm.do?bookNum=${mem.bookNum }">수정</a></td>
		   <td><a href="${contextPath}/member/delMember.do?bookNum=${mem.bookNum }">삭제</a></td> 
       </tr>
     </c:forEach>
</c:when>
</c:choose>
   </table>  
 <a href="${contextPath}/member/memberForm.do"><p class="cls2">예약하기</p></a>
</body>
</html>
