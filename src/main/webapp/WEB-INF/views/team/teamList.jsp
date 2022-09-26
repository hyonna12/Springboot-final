<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">팀 목록 페이지</h1>
<div class="container">

	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀 이름</th>
				<th>경기장 이름</th>
				<th>연고지</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach var="team" items="${teamList}">
			<tr>
				<td id="id">${team.id}</td>
				<td>${team.teamName}</td>
				<td>${team.stadiumName}</td>
				<td>${team.region}</td>
				<td><input type="checkbox"></td>
			</tr>
			</c:forEach>
			
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
	
	$.ajax("/team" + id, {
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
