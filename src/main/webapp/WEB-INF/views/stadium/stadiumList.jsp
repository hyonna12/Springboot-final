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
			<c:forEach var="stadium" items="${stadiumList}">
			<tr>
				<td id="id">${stadium.id}</td>
				<td>${stadium.stadiumName}</td>
				<td>${stadium.createDate}</td>
				<td><input type="checkbox"></td>
			</tr>
			</c:forEach>
				<!-- <form method="get" action="CheckboxServlet"></form> -->
		</tbody>
	</table>

	<div style="text-align:right;">
		<button id="btnDelete" class="btn btn-danger">삭제</button>
	</div>
	
</div>

<script>
$("#btnDelete").click(()=>{
	deleteById();
});

function deleteById(){
	let id = $("#id").val();
	
	$.ajax("/stadium" + id, {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
			location.reload();
		} else {
			alert("삭제 실패");
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>
