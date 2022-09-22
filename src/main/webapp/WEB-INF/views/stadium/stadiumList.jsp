<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">경기장 목록 페이지</h1>
<div class="container">

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장 이름</th>
				<th>개장일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>**야구장</td>
				<td>****-**-**</td>
				<td><input type="checkbox"></td>
			</tr>
			<tr>
				<td>2</td>
				<td>**야구장</td>
				<td>****-**-**</td>
				<td><input type="checkbox"></td>
			</tr>
			<tr>
				<td>3</td>
				<td>**야구장</td>
				<td>****-**-**</td>
				<td><input type="checkbox"></td>
				<!-- <form method="get" action="CheckboxServlet"></form> -->
			</tr>
		</tbody>
	</table>

	<div style="text-align:right;">
		<input type="button" value="삭제">
	</div>
	
</div>

<%@ include file="../layout/footer.jsp"%>
