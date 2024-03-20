<?php
	if(isset($_COOKIE["last2"])){
		echo "last visited time is";
		$formatted=date("Y-m-d H-i-s");
		echo $formatted;
		setcookie("last2",$formatted,0,"/");
	}
	else{
		echo "<h1>welcome to the page for the first time</h1>";
		$formatted=date("Y-m-d H-i-s");
		setcookie("last2",$formatted,0,"/");
		


	}
?>