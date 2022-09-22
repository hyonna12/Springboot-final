<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">팀별 전체 선수 목록 페이지</h1>
<br />
<div class="container">
	<div class="d-flex flex-row justify-content-center">
		<div style="text-align: right;">
			<button class="btn btn-outline-secondary"><a href="#">롯데</a></button>
		</div>
		<div style="text-align: right;">
			<button class="btn btn-outline-secondary"><a href="#">삼성</a></button>
		</div>
		<div style="text-align: right;">
			<button class="btn btn-outline-secondary"><a href="#">두산</a></button>
		</div>
	</div>

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수 이름</th>
				<th>포지션</th>
				<th>사유</th>
				<th>퇴출일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>a</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<td>2</td>
				<td>b</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
			<tr>
				<td>3</td>
				<td>c</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>
