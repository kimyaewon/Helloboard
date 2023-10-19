<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 

<!DOCTYPE html>
<html>
<head>
    <title>JSP 게시판 등록 페이지</title>
</head>
<body>
    <h1>JSP 게시판 등록 페이지</h1>
    <form action="/board/writepro" method="post"  name="add_frm" id="add_frm">
        <table width="50%" border="1">
            <tr>
                <td align="center" style="background-color: #ececec;">
                    컬럼1
                </td>
                <td>
                    <input type="text" name="title" id="column1" style="width:98%;" />
                </td>
            </tr>
            <tr>
                <td align="center" style="background-color: #ececec;">
                    컬럼2
                </td>
                <td>
                    <input type="text" name="column2" id="column2" style="width:98%;" />
                </td>
            </tr>
        </table>
    </form>

 

    <div style="width:50%;margin-top: 30px;text-align:right;">
        <button>등록</button>
    </div>

</body>
</html>