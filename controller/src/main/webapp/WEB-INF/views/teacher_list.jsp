<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Teachers List</title>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/font-awesome.css' />" rel="stylesheet"></link>
</head>
	<body>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
					        data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Brand</a>
				</div>
				
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
				     id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
						<li><a href="#">Link</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
						                        data-toggle="dropdown" role="button" aria-expanded="false">Dropdown
							<span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li><a href="#">Separated link</a></li>
								<li class="divider"></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">Link</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
						                        data-toggle="dropdown" role="button" aria-expanded="false">Dropdown
							<span class="caret"></span>
						</a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid --> </nav>
		
		<div class="container">
			<div class="well">
				<strong>List of Persons</strong>
			</div>
			<table class="table table-stripped">
				<tr>
					<th>S.No</th>
					<th>Name</th>
					<th>Age</th>
				</tr>
				<c:forEach items="${teachers}" var="teacher" varStatus="itr">
					<tr>
						<td>${offset + itr.index +1 }</td>
						<td>${teacher.firstName }</td>
						<td>${teacher.lastName }</td>
					</tr>
				</c:forEach>
			</table>
			<tag:paginate max="15" offset="${offset}" count="${count}"
			              uri="/person/list" next="&raquo;" previous="&laquo;" />
		</div>
		
		
		<script type="text/javascript" src="/js/jquery.js"></script>
		<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	</body>>
</body>
</html>