<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">퇴출 선수 목록 페이지</h1>
<div class="container">

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀 이름</th>
				<th>포지션</th>
				<th>선수 이름</th>
				<th>사유</th>
				<th>퇴출일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expulsion" items="${expulsionList}">
			<tr>
				<td id="id">${expulsion.id}</td>
				<td>${expulsion.teamName}</td>
				<td>${expulsion.position}</td>
				<td>${expulsion.playerName}</td>
				<td>${expulsion.reason}</td>
				<td>${expulsion.deleteDate}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>
