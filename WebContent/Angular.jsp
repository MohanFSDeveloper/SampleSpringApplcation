<!DOCTYPE html>
<html lang="en-US">
<meta charset="utf-8">
<meta name="viewport" content="width = device-width,initial-scale=1">
<!-- <script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.10.2.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"> -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- <script src="js/angular.js"></script> -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="js/mohanApp.js"></script>
<script src="js/mohanController.js"></script> <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<body>
	<div class="container-fluid">
		<div data-ng-app="mohanApp" data-ng-controller="mohanController">
			<div class="row">
				<div class="col-sm-2">
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-8">
							<img src="images/rounded corner.jpg" class="img-circle"
								alt="mohan image" width="100" height="86">
						</div>
						<div class="col-sm-2"></div>
					</div>
					<div class="row">
						<div class="col-sm-2"></div>
						<div class="col-sm-8">
							<span><small>Welcome : <b>Mohan</b></small></span>
						</div>
						<div class="col-sm-2"></div>
					</div>

				</div>
				<div class="col-sm-10">
					<div class="row">
						<div class="col-sm-10">
							<h3>
								<small>MMM Consultancy</small>
							</h3>
						</div>
						<div class="col-sm-2">
							<div class="row" style="margin-top: 5px;">
								<span class="glyphicon glyphicon-user"></span> <span><small>Welcome
										: <b>Mohan</b>
								</small></span>
							</div>
							<div class="row" style="margin-top: 5px;">
								<a href="#"> <span class="glyphicon glyphicon-log-out"></span><span
									style="margin-left: 5px;"><small>Log Out</small></span>
								</a>
							</div>
						</div>
					</div>
					<div class="row">
						<nav class="navbar navbar-default">

							<ul class="nav navbar-nav">
								<li class="active"><a href="#">Home</a></li>
								<li><a href="#">Services</a></li>
								<li><a href="#">Products</a></li>
								<li><a href="#">Contacts</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
			<div class="row">

				<div class="col-sm-2">

					<div class="panel panel-default">
						<div class="panel-heading">Notifications</div>
						<div class="panel-body">
							<a href="#">New<span class="badge">5</span></a><br> <br>
							<a href="#">Approved<span class="badge">2</span></a><br> <br>
							<a href="#">Rejected<span class="badge">3</span></a><br> <br>
							<input type="button" value="GetName" data-ng-click="printVarName();" />
						</div>
					</div>

				</div>
				<div class="col-sm-10">
					<div class="table-responsive">
						<div class="panel panel-default">
							<div class="panel-heading">Search Results</div>
							<table class="table">
								<thead>
									<tr>
										<th>Firstname</th>
										<th>Lastname</th>
										<th>Email</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>John</td>
										<td>Doe</td>
										<td>john@example.com</td>
									</tr>
									<tr>
										<td>Mary</td>
										<td>Moe</td>
										<td>mary@example.com</td>
									</tr>
									<tr>
										<td>July</td>
										<td>Dooley</td>
										<td>july@example.com</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>

