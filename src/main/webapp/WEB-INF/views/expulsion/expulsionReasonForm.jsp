<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">퇴출 사유 등록 페이지</h1>

	<br />
	<div class="d-flex flex-row justify-content-center">
		<form class="d-flex">
			<label for="teamName" class="form-label">팀 이름 :</label>
			<div style="width: 300px">
				<input id="teamName" class="form-control me-2" type="text" placeholder="teamName" name="teamName">
			</div>
			<label for="position" class="form-label">포지션 :</label>
			<div style="width: 300px">
				<input id="position" class="form-control me-2" type="text" placeholder="position" name="position">
			</div>
			<label for="playerName" class="form-label">선수 이름 :</label>
			<div style="width: 300px">
				<input id="playerName" class="form-control me-2" type="text" placeholder="playerName" name="playerName">
			</div>
			<label for="reason" class="form-label">퇴출 사유 :</label>
			<div style="width: 300px">
				<input id="reason" class="form-control me-2" type="text" placeholder="reason" name="reason">
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
		reason: $("#reason").val(),
	};

	$.ajax("/expulsion", {
		type: "POST",
		dataType: "json", 
		data: JSON.stringify(data), 
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/expulsion/expulsionPlayerList";
		}
	});
}
</script>
<%@ include file="../layout/footer.jsp"%>
