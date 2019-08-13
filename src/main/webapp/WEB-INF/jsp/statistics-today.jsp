<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>每日统计</title>
    <style type="text/css">
        table {
            border-collapse: collapse;
            margin: auto;
        }

        table, th, td {
            border: 1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
<%@ include file="common/header.jsp" %>

<table style="border: 1px solid black;width: 100%;">
<tr>
    <th>日期</th>
    <th>客户名称</th>
    <th>材料名称</th>
    <th>颜色</th>
    <th>编号</th>
    <th>规格</th>
    <th>重量</th>
    <th>单价</th>
    <th>销售金额</th>
    <th>切割工</th>
    <th>税点</th>
    <th>冲帐</th>
    <th>进项金额</th>
    <th>应收款</th>
    <th>收款方式</th>
    <th>备注</th>
</tr>
    <c:forEach items="${todayOrders}" var="order">
    <tr>
<%--    日期--%>
        <td><fmt:formatDate value="${order.orderDate}" pattern="yyyy-MM-dd"/></td>
<%--    客户名称--%>
        <td>${order.orderCustomerName}</td>
<%--    材料名称--%>
        <td>${order.orderMaterialName}</td>
<%--    颜色--%>
        <td>${order.orderMaterialColor}</td>
<%--    编号--%>
        <td>${order.orderId}</td>
<%--    规格--%>
        <td>${order.orderMaterialSpecifications}</td>
<%--    重量--%>
        <td>${order.orderMaterialWeight}</td>
<%--    单价--%>
        <td>${order.orderPrice}</td>
<%--    销售金额--%>
        <td>${order.orderTotalPrice}</td>
<%--    切割工--%>
        <td>${order.orderCuttingWage}</td>
<%--    税点--%>
        <td>${order.orderTaxPoint}</td>
<%--    冲帐--%>
        <td>${order.orderStrike}</td>
<%--    进项金额--%>
        <td>${order.paymentInputMoney}</td>
<%--    应收款--%>
        <td>${order.showEveryReceivables}</td>
<%--    收款方式--%>
        <td>${order.paymentMethod}</td>
<%--    备注--%>
        <td>${order.paymentRemarks}</td>
    </tr>
    </c:forEach>
</table>
<%@ include file="common/footer.jsp" %>
</body>
</html>
