<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    response.setStatus(200); // 200 = HttpServletResponse.SC_OK
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <title>温馨提示</title>
	<link rel="shortcut icon" type="image/x-icon" href="<%=basePath%>assets/images/favicon.ico" />
	<link rel="stylesheet" href="<%=basePath%>assets/css/style.css" />
	<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			@media screen and ( min-width: 320px ) and ( max-width: 359px ){	html{font-size:15px;} }
			@media screen and (min-width: 360px) and (max-width: 374px){	html{font-size:16px;} }
			@media screen and (min-width: 375px) and ( max-width: 539px ){	html{font-size:18px;} }
			@media screen and ( min-width: 540px ) and ( max-width: 639px ){	html{font-size:19px;} }
			@media screen and ( min-width: 640px ){		html{font-size:24px;} }
			.imgDiv{
				overflow: hidden;
				padding-top: 40%;
    			position: relative;
			}
			.img{
				display: block;
				margin: 0 auto;
				width: 6.875rem;
				height: 7.5rem;
			}
			.sysBusy .img{
				background: url(<%=basePath%>assets/images/sysBusy.png);
				background-size: contain;
			}
			.tips{
				font-size: 0.875rem;
				text-align: center;
				color: #999;
				height: 4.0rem;
   				line-height: 4.0rem;
			}
		</style>
  </head>
  
  <body>
		<div class="imgDiv sysBusy">
			<div class="img">
				
			</div>
		</div>
		<div class="tips">
			亲，系统繁忙，请稍候重试~
		</div>
	</body>
</html>
