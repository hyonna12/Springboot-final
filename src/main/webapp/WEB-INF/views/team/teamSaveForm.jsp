<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">팀 등록 페이지</h1>


<br />
<div class="d-flex flex-row justify-content-center">
	<form class="d-flex">
		<label for="stadiumName" class="form-label">경기장 이름 :</label>
		<div style="width: 300px">
			<input id="stadiumName" class="form-control me-2" type="text" placeholder=stadiumName name="stadiumName">
		</div>
		<label for="teamName" class="form-label">팀 이름 :</label>
		<div style="width: 300px">
			<input id="teamName" class="form-control me-2" type="text" placeholder="teamName" name="teamName">
		</div>
		<button id="btn_Save" class="btn btn-primary" type="submit">등록</button>
	</form>
</div>

<script>
$("#btn_Save").click(()=>{
	save();
});

function save() {
	let data = {
		stadiumName: $("#stadiumName").val(),
		teamName: $("#teamName").val()
	};

	$.ajax("/team", {
		type: "POST",
		dataType: "json", 
		data: JSON.stringify(data), 
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/team/teamList";
		}
	});
}
</script>

<%@ include file="../layout/footer.jsp"%>
