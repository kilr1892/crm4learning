<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="common/header.jsp" %>

第一列无序号
<form action="/excel/input" method="post" enctype="multipart/form-data">
    <input type="hidden" name="token" value="${token}"/>
  <table>
      <tr>
          <td>
              <input type="file" name="file" />
          </td>
          <td> <input type="submit" value="上传" /></td>
      </tr>
  </table>
</form>

<c:if test="${!empty size}">
<p>共有${size}条记录(不包括标题)</p>
</c:if>
<br/>
<c:if test="${!empty count}">
<p>成功${count}条</p>
</c:if>

<%@ include file="common/footer.jsp" %>
</body>
</html>
