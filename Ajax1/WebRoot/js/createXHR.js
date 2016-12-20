var xhr;
function createXHR(){
	if(window.XMLHttpRequest){
		xhr=new XMLHttpRequest();//XMLHttpRequest 用于在后台与服务器交换数据。
		                     // 这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。
	}else{
		//低版本IE浏览器
		xhr=new ActiveXObject("Microsoft.XMLHTTP");
  }
}