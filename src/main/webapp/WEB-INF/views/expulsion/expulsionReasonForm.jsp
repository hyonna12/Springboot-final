<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">퇴출 사유 등록 페이지</h1>

	<br />
	<div class="d-flex flex-row justify-content-center">
		<form class="d-flex" method="get" action="/">
			<label for="email" class="form-label">퇴출 사유 :</label>
			<div style="width: 300px">
				<input class="form-control me-2" type="text" placeholder="stadium" name="stadium">
			</div>
			<button class="btn btn-primary" type="submit">등록</button>

		</form>
	</div>

<%@ include file="../layout/footer.jsp"%>
