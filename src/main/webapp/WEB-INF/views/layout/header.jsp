<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>BaseballManagement</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	rel="stylesheet">

</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Baseball</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Stadium</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="/stadium/stadiumList">경기장 목록</a></li>
							<li><a class="dropdown-item" href="/stadium/stadiumSaveForm">경기장 등록</a></li>
						</ul>
					</li>
					<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Player</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="/player/playerList">선수 목록</a></li>
							<li><a class="dropdown-item" href="/player/playerSaveForm">선수 등록</a></li>
							<li><a class="dropdown-item" href="/player/playerPositionList">포지션별 선수</a></li>
							<li><a class="dropdown-item" href="/player/playerTeamList">팀별 전체 선수</a></li>
						</ul>
					</li>
					<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Team</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="/team/teamList">팀 목록</a></li>
							<li><a class="dropdown-item" href="/team/teamSaveForm">팀 등록</a></li>
						</ul>
					</li>
					<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Expulsion</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="/expulsion/expulsionPlayerList">퇴출 선수 목록</a></li>
							<li><a class="dropdown-item" href="/expulsion/expulsionReasonForm">퇴출 사유 등록</a></li>
						</ul>
					</li>
					
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" style="height:500px">
	
	<br /><br />