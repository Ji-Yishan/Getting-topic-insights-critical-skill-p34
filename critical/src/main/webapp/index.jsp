<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1309180_m0vigzfu7y.css">

</head>
<body>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Search</div>
        <div class="form-wrapper">
            <form action="${pageContext.request.contextPath}/p34/search" method="post">
                serialNumber：<input type="text" name="serialNumber"><br><br><br>
                pageNum：<input type="text" name="pageNum"><br><br><br>


                <input type="submit" value="添加">

            </form>
            <style>
                * {
                    margin: 0;
                    padding: 0;
                }
                html {
                    height: 100%;
                }
                body {
                    height: 100%;
                }
                .container {
                    height: 100%;
                    background-image: linear-gradient(to right, #999999, #330867);
                }
                .login-wrapper {
                    background-color: bisque;
                    width: 358px;
                    height: 388px;
                    border-radius: 15px;
                    padding: 0 50px;
                    position: relative;
                    left: 50%;
                    top: 50%;
                    transform: translate(-50%,-50%);
                }
                .header {
                    font-size: 38px;
                    font-weight: bold;
                    text-align: center;
                    line-height: 200px;
                }
                .input-item {

                    width: 100%;
                    margin-bottom: 20px;
                    border: 0;
                    padding: 10px;
                    border-bottom: 1px solid rgb(128,125,125);
                    font-size: 15px;
                    outline: none;
                }

                .input-item::placeholder {
                    text-transform: uppercase;
                }
                .btn {
                    text-align: center;
                    padding: 10px;
                    width: 100%;
                    margin-top: 40px;
                    background-image: linear-gradient(to right,#a6c1ee, #fbc2eb);
                    color: #fff;
                }
                .msg {
                    text-align: center;
                    line-height: 88px;
                }
                a {
                    text-decoration-line: none;
                    color: #abc1ee;
                }
            </style>
            <!--      <div class="btn">添加</div>-->
            <div class="input-item ">
                <!--        <input class="search-text" name="inputs" placeholder="serialNumber" >-->
                <!--      <a class="search-btn" onclick="as submit">-->
                <!--        <i class="iconfont iconchazhao"></i>-->
                <!--      </a>-->
            </div>
            <div class="msg">
            </div>
        </div>
    </div>
</div>
</body>
<%--<script>--%>

<%--    <!--   function as() {-->--%>
<%--    <!--   let e = document.getElementsByClassName('search-text').inputs.value-->--%>
<%--    <!--   window.location.href = `https://www.baidu.com/s?wd=${e}`-->--%>
<%--        <!--    console.log("fsfs",e)-->--%>
<%--    <!--   }-->--%>
<%--</script>--%>
</html>