function checkLogin(){
	var  username=document.form1.username.value.trim();
	var pwd=document.form1.pwd.value.trim();
	//1.生成xhr对象
	 createXHR();
	//2.建立对服务器的调用
	 xhr.open("POST","check",true);//1.发送请求的方式 2.样请求的页面 3.是否异步
	 // Post方式发送数据
	 xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	 //3.设回调函数,监听xhr的状态
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				//获得服务器返回的文本信息,对返回内容进行操作
				var res=xhr.responseText;
				document.getElementById("msg").innerText=res;
			}
		};
		//4.发送请求
		xhr.send("username="+username+"&pwd="+pwd);//get方式	
}