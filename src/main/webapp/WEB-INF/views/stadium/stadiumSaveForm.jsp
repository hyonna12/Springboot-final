<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">경기장 등록 페이지</h1>


	<br />
	<div class="d-flex flex-row justify-content-center">
		<form class="d-flex" method="get" action="/">
			<label for="email" class="form-label">경기장 이름 :</label>
			<div style="width: 300px">
				<input class="form-control me-2" type="text" placeholder="stadium" name="stadium">
			</div>
			<button class="btn btn-primary" type="submit">등록</button>

		</form>
	</div>


<%@ include file="../layout/footer.jsp"%>
