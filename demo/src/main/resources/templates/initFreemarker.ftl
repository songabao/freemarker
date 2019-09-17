<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎${name}登录</title>
</head>
<style type="text/css">
    td{
        width: 5%;
    }
    table{
        width: 80%;
    }
    .headtd{
        text-align: center;
        color: #94fdff;
    }
    .headtr{
        background-color: #2d280f;
    }
    .contenttd{
        height: 50px;
        text-align: center;
    }
</style>
<body>
    <form>
        <table border="1" cellpadding="0" cellspacing="0" align="center">
            <caption  ><span style="color: red">${name}</span>创建的表格</caption>
            <tr class="headtr">
                <td class="headtd">姓名</td>
                <td class="headtd">年龄</td>
                <td class="headtd">性别</td>
                <td class="headtd">手机号</td>
                <td class="headtd">邮箱</td>
                <td class="headtd">地址</td>
            </tr>
            <tr >
                <td class="contenttd">${name}</td>
                <td class="contenttd">${age}</td>
                <td class="contenttd">${sex}</td>
                <td class="contenttd">${tel}</td>
                <td class="contenttd">${email}</td>
                <td class="contenttd">${address}</td>
            </tr>
        </table>
    </form>

</body>
</html>