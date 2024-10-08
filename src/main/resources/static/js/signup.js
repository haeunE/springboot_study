$("#chk").on("click",(e)=>{
	e.preventDefault(); //submit 안되게
	const username = $("#username").val();
	
	alert(username);
	
	$.ajax({
		type:"GET",
		url: "/idcheck?username="+username
	}).done(function(response){
		console.log(response)
		if(response==0){
			alert("사용가능한 아이디 입니다.")
		}else{
			alert("사용불가능한 아이디 입니다.")
		}
	}).fail(function(response){
		console.log(error)
	})
})