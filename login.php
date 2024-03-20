<body>
	<form action="" method="post">
		<label for="username">username</label>
		<input id="username"  type="text" name="username"/>
		<label for="password">password</label>
		<input id="password" type="password" name="password"/>
		<input type="submit" value="submit"/>
	</form>
</body>
<?php
	if($_POST){
		$username=$_POST['username'];
		$password=$_POST['password'];
		
		$conn=mysqli_connect("localhost","root","root","auth");
		if($conn){
			$query="select * from login where username='$username' and password='$password'";
			$result=mysqli_query($conn,$query);
			if(mysqli_num_rows($result)>0){
				echo "<script>alert('login successful')</script>";
			}else{
				echo "<script>alert('login failed')</script>";
			}
			


		}
		
	}
?>