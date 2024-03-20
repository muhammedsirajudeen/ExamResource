<body>
	<h1>student result</h1>
	<form action="" method="post">
		<input type="text" name="rollno"/>
		<input type="submit" value="submit"/>
	</form>
	<table style="border-collapse: collapse; border-width: 1px; border-color: black;">
	<tr>
		<th >rollno</th>
		<th>name</th>
		<th>mark</th>
		<th>grade</th>

	</tr>
<?php

	if(isset($_POST["rollno"])){
		$rollno=$_POST["rollno"];
		$conn=mysqli_connect("localhost","root","root","auth");
		if($conn){
			$query="select * from students where rollno='$rollno'";
			$result=mysqli_query($conn,$query);
			if(mysqli_num_rows($result)>0){
				while($row=mysqli_fetch_assoc($result)){
					$name=$row["name"];
					$mark=$row["mark"];
					$grade=$row["grade"];
					echo "<tr> <td>rollno</td> <td>$name</td> <td>$mark</td> <td>$grade</td>  </tr>";
				}
			}

		}else{
			echo "database connection failed";
		}
	}
?>

	</table>
</body>



