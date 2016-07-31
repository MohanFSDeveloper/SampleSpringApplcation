	app.controller('mohanController', function($scope, $http) {
		$scope.name = "John";
		$scope.sampleArr=[1,15,19,2,40];
		$scope.sampleNameArr = ['Mohan','Saravanan','Mohana vidhya','Sasi'];
		
		$scope.orderBy = function(x) {
			$scope.orderByName = x;
		};
		$scope.printVarName = function() {
			 $http({
			        url : "getEmployeeDtls.do",
			        dataType : "application/json",
			        method : "GET",
			    }).then(function mySucces(response) {
			    	alert("Hiiiiiiiiiiiiiiiiiiiii");
			    	$scope.tableData = response.data;
			    }, function myError(response) {
			        
			    });
		  }
	});