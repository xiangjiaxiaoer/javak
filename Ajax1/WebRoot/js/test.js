function checkTest(){
	var  username=document.form1.username1.value.trim();
	//1.生成xhr对象
	 createXHR();
	//2.建立对服务器的调用
	 xhr.open("POST","test",true);
	 xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		//3.设回调函数,监听xhr的状态
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				//获得服务器返回的文本信息,对返回内容进行操作
				var res=xhr.responseText.trim();	
				document.getElementById("msg2").innerText=res;
				if(res=="用户名重复"){					     
					document.getElementById("msg2").innerHTML="<span style='color:red'>"+res+"</span>";
				}else if(res=="用户可以注册"){
					document.getElementById("msg2").innerHTML="<span style='color:green'>"+res+"</span>";
				}	
								
				//比较要用双等于
//				if(res=="用户名重复"){
//					document.getElementById("msg2").style.color="red";
//					document.getElementById("msg2").innerText="用户名重复";
//				}else if(res=="用户可以注册"){
//					document.getElementById("msg2").style.color="green";
//					document.getElementById("msg2").innerText="用户可以注册";
//				}
		}
		};
		//4.发送请求
		xhr.send("username1="+username);//get方式	
}