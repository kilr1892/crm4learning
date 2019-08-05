<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单输入</title>
    <script src="../js/jquery-3.4.1.min.js"></script>
    <style type="text/css">
        table {
            border-collapse: collapse;
            margin: auto;
        }

        table, th, td {
            border: 1px solid black;
            text-align: center;
        }

        input, textarea {
            background-color: transparent;
            border: 0;
        }

        select {
            text-align: center;
            text-align-last: center;

        }

        textarea {
            font-size: 20px;
            font-weight: bold;
            color: #F00;
        }
    </style>
</head>
<body>
<%@ include file="common/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="orderAddForm" method="post">
    <table style="border: 1px solid black;width: 900px;">
        <tr>
            <th colspan="9">温州奥格塑业客户订货单${orderId.orderDay}-${orderId.orderNum}</th>
            <input type="hidden" name="orderId" value="${orderId.orderId}"/>
        </tr>
        <tr>
            <td colspan="2">客户名称</td>
            <td colspan="4">
                <input id="getCustomerName" name="orderCustomerName" style="width:100%;" list="customersName"/>
                <datalist id="customersName">
                    <%--                用jstl循环, (考虑用redis)--%>
                    <c:forEach items="${customers}" var="customers">
                    <option value="${customers.customName}">
                        </c:forEach>
                </datalist>
                <input type="hidden" id="orderCustomerId" name="orderCustomerId"/>
            </td>
            <td width="100">电话</td>
            <td colspan="2">
                <input id="getCustomerPhone" name="orderCustomerPhone" style="width:100%;" type="text"/>
                <%--            这里用名称失去焦点,   发送ajax请求 得到数据填充--%>
            </td>
        </tr>
        <tr>
            <td colspan="2">送货地址</td>
            <td colspan="4">
                <input style="width:100%;" name="orderCustomerAddress" type="text"/>
            </td>
            <td>交货日期</td>
            <td colspan="2">
<%--                <input style="width:100%" name="orderDate" type="date"/>--%>
                <input style="width:100%" name="orderDate" type="date"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">产品名称</td>
            <td>规格厚度</td>
            <td>颜色</td>
            <td>米数</td>
            <td>重量(kg)</td>
            <td>电晕</td>
            <td>折口</td>
            <td>单价</td>
        </tr>
        <c:forEach var="i" begin="0" end="7">
            <tr>
                <td style="width: 20px;">${i+1}</td>
                <td>
                        <%-- 产品名称--%>
                    <label>
                        <select style="width: 90px;" name="orderMaterialName${i}">
                            <option value=""></option>
                            <option value="EVA透明">EVA透明</option>
                            <option value="高频磨砂">高频磨砂</option>
                            <option value="PE电割膜">PE电割膜</option>
                            <option value="镜面乳白">镜面乳白</option>
                            <option value="PEVA透明">PEVA透明</option>
                        </select>
                    </label>
                </td>
                    <%--  规格厚度--%>
                <td>
                    <label>
                        <input style="width: 100%;" name="orderMaterialSpecifications${i}" type="text"/>
                    </label>
                </td>
                    <%--颜色--%>
                <td>
                    <label>
                        <input style="width: 100%;" name="orderMaterialColor${i}" type="text"/>
                    </label>
                </td>
                    <%-- 米数--%>
                <td>
                    <label>
                        <input style="width: 100%;" name="orderMaterialMeter${i}" type="text"/>
                    </label>
                </td>
                    <%--重量(kg)--%>
                <td>
                    <label>
                        <input style="width: 100%;" name="orderMaterialWeight${i}" type="text"/>
                    </label>
                </td>
                    <%-- 电晕--%>
                <td>
                    <label>
                        <select style="width: 100px;" name="orderMaterialCorona${i}">
                            <option value="无"></option>
                            <option value="有">√</option>
                            <option value="无">×</option>
                        </select>
                    </label>
                </td>
                    <%--折口--%>
                <td>
                    <label>
                        <select style="width: 100px;" name="orderMaterialFoldingMouth${i}">
                            <option value="无"></option>
                            <option value="有">有</option>
                            <option value="无">无</option>
                        </select>
                    </label>
                </td>
                    <%--单价--%>
                <td>
                    <label>
                        <input style="width: 100%;" name="orderPrice${i}" type="text"/>
                    </label>
                </td>
            </tr>
        </c:forEach>

        <tr>
            <td>备注</td>
            <td colspan="8">
                <label>
                    <input style="width: 100%;" name="orderRemarks" type="text"/>
<%--                    <textarea style="height: 100%;width: 100%" name="orderRemarks"></textarea>--%>
                </label>
            </td>
        </tr>

    </table>
    <div style="float: right;width: 400px;">
        <h3><a href="javascript:void(0)" style="float: left" onclick="submitForm()">提交</a></h3>
    </div>
</form>
<br/>
<%@ include file="common/footer.jsp" %>
<script>
    function getPhone() {
        var customerName = $("#getCustomerName").val();
        if (customerName === "") {
        } else {
            $.ajax({
                type: 'get',
                url: '/customer/getCustomerPhone?customerName=' + customerName,
                dataType: 'json',
                contentType: 'application/json',
                success: function (data) {
                    $("#getCustomerPhone").val(data[0].customPhone);
                    $("#orderCustomerId").val(data[0].customId);
                }
            });
        }
    }

    function submitForm() {
        $.ajax({
            type: 'post',
            url: '/order/add',
            data: $("#orderAddForm").serialize(),
            success:function () {
                alert('添加成功');
            }
        });
    }


    $("#getCustomerName").blur(function () {
        getPhone();
    });
</script>
</body>

</html>