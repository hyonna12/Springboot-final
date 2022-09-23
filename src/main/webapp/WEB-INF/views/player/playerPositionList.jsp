<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">포지션별 선수 목록 페이지</h1>
<div class="container">

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>포지션</th>
				<th>롯데</th>
				<th>삼성</th>
				<th>두산</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stadium" items="${PlayerPositionDto}">
			<tr>
				<td>${PlayerPositionDto.position}</td>
				<td>${PlayerPositionDto.playerName}</td>
				<td>${PlayerPositionDto.playerName}</td>
				<td>${PlayerPositionDto.playerName}</td>
			</tr>
			</c:forEach>
			
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>
