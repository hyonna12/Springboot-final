<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">선수 목록 페이지</h1>
<div class="container">

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수 이름</th>
				<th>등번호</th>
				<th>팀 이름</th>
				<th>포지션</th>
				<th>등록일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>a</td>
				<td>10</td>
				<td>롯데</td>
				<td>투수</td>
				<td>*</td>
				<td><input type="checkbox"></td>
			</tr>
			<tr>
				<td>2</td>
				<td>b</td>
				<td>20</td>
				<td>삼성</td>
				<td>내야수</td>
				<td>*</td>
				<td><input type="checkbox"></td>
			</tr>
			<tr>
				<td>3</td>
				<td>c</td>
				<td>30</td>
				<td>두산</td>
				<td>외야수</td>
				<td>*</td>
				<td><input type="checkbox"></td>
			</tr>
		</tbody>
	</table>

	<div style="text-align:right;">
		<input type="button" value="삭제">
	</div>

</div>

<%@ include file="../layout/footer.jsp"%>
