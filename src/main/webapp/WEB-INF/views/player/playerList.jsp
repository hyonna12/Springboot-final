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
			<c:forEach var="player" items="${playerDto}">
			<tr>
				<td id="id">${playerDto.no}</td>
				<td>${playerDto.playerName}</td>
				<td>${playerDto.number}</td>
				<td>${playerDto.teamName}</td>
				<td>${playerDto.position}</td>
				<td>${playerDto.createDate}</td>
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
	
	$.ajax("/player" + id, {
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
