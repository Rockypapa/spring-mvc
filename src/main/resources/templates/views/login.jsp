<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<%--<script type="text/javascript" src="../static/js/jquery-3.1.1.min.js"></script>--%>
<script type="text/javascript">
    $(function () {//异步交互
        $("#uname").blur(function () {
            //获取文本输入的值
            var uname = $(this).val();
            //发给服务器
            //期望服务器响应回来的数据格式{"userExsist":true,"msg":"用户名已被注册"}
            //{"userExsist":false,"msg":"用户名可以使用"}
            $.get("nameVerify",{uname:uname},function (data) {
                var span = $("#uname_span");
                //判断userExsist键值是否是true
                //接收服务器返回的数据
                if (data.userExist){
                    //用户名存在
                    span.css("color","red");
                    span.html(data.msg);
                }else {
                    //用户名不存在
                    span.css("color","green");
                    span.html(data.msg);
                }
            });
        });
    });
</script>
<body>
<form  action="${pageContext.request.contextPath}/verify" method="post">
    <!--onblur 失去焦点产生事件-->
    用户名:<input type="text" name="uname" id="uname" placeholder="请输入用户名"/>
    <span id="uname_span"></span>
    密码:<input type="password" name="pwd" id="pwd" placeholder="请输入密码"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>