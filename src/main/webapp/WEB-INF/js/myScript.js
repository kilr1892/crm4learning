function updateReceivables() {

    prevent_reloading();

    var currentRow;

    // 用于存放json数组
    var result = JSON.parse('{\"data\":[]}');

    // 当前行号
    currentRow = event.srcElement.parentElement.parentElement.rowIndex;
    // currentRow += 1;
    // 所有行数
    var table = $("#tableAll");
    var currentRowLength = table.find('tr').length;


    for (i = currentRow; i < currentRowLength; i++) {
        // td:eq(8)销售金额   td:eq(9)切割工   td:eq(10)税点  td:eq(11)冲帐  td:eq(12)进项金额  td:eq(13)应收款
        var a = new Object();

        a.primaryKeyForOrder = document.getElementById("primaryKeyForOrder" + i).value;

        var orderDate = table.find('tr').eq(i).find('td:eq(0)').text();
        if (orderDate == "") {
            orderDate = "";
        }
        a.orderDate = orderDate;

        var orderCustomerName = table.find('tr').eq(i).find('td:eq(1)').text();
        if (orderCustomerName == "") {
            orderCustomerName = "";
        }
        a.orderCustomerName = orderCustomerName;

        var orderMaterialName = table.find('tr').eq(i).find('td:eq(2)').text();
        if (orderMaterialName == "") {
            orderMaterialName = "";
        }
        a.orderMaterialName = orderMaterialName;

        var orderMaterialColor = table.find('tr').eq(i).find('td:eq(3)').text();
        if (orderMaterialColor == "") {
            orderMaterialColor = "";
        }
        a.orderMaterialColor = orderMaterialColor;

        var orderId = table.find('tr').eq(i).find('td:eq(4)').text();
        if (orderId == "") {
            orderId = "";
        }
        a.orderId = orderId;

        var orderMaterialSpecifications = table.find('tr').eq(i).find('td:eq(5)').text();
        if (orderMaterialSpecifications == "") {
            orderMaterialSpecifications = "";
        }
        a.orderMaterialSpecifications = orderMaterialSpecifications;

        var orderMaterialWeight = table.find('tr').eq(i).find('td:eq(6)').text();
        if (orderMaterialWeight == "") {
            orderMaterialWeight = 0;
        }
        a.orderMaterialWeight = orderMaterialWeight;

        var orderPrice = table.find('tr').eq(i).find('td:eq(7)').text();
        if (orderPrice == "") {
            orderPrice = 0;
        }
        a.orderPrice = orderPrice;

        // var orderTotalPrice = table.find('tr').eq(i).find('td:eq(8)').text();
        var orderTotalPrice = Number(orderMaterialWeight) * Number(orderPrice);
        table.find('tr').eq(i).find('td:eq(8)').text(orderTotalPrice);
        if (orderTotalPrice == "") {
            orderTotalPrice = 0;
        }
        a.orderTotalPrice = orderTotalPrice;

        var orderCuttingWage = table.find('tr').eq(i).find('td:eq(9)').text();
        if (orderCuttingWage == "") {
            orderCuttingWage = 0;
        }
        a.orderCuttingWage = orderCuttingWage;

        var orderTaxPoint = table.find('tr').eq(i).find('td:eq(10)').text();
        if (orderTaxPoint == "") {
            orderTaxPoint = 0;
        }
        a.orderTaxPoint = orderTaxPoint;

        var orderStrike = table.find('tr').eq(i).find('td:eq(11)').text();
        if (orderStrike == "") {
            orderStrike = 0;
        }
        a.orderStrike = orderStrike;

        var paymentInputMoney = table.find('tr').eq(i).find('td:eq(12)').text();
        if (paymentInputMoney == "") {
            paymentInputMoney = 0;
        }
        a.paymentInputMoney = paymentInputMoney;

        var lastShowEveryReceivables = 0;
        if (i == 1) {
            lastShowEveryReceivables = 0;
        } else {
            lastShowEveryReceivables = table.find('tr').eq(i - 1).find('td:eq(13)').text();
        }
        a.lastShowEveryReceivables = lastShowEveryReceivables;

        var showEveryReceivables = Number(lastShowEveryReceivables) + Number(orderTotalPrice) + Number(orderCuttingWage)
            + Number(orderTaxPoint) + Number(orderStrike) - Number(paymentInputMoney);
        table.find('tr').eq(i).find('td:eq(13)').text(showEveryReceivables);
        a.showEveryReceivables = showEveryReceivables;

        var paymentMethod = table.find('tr').eq(i).find('td:eq(14)').text();
        a.paymentMethod = paymentMethod;

        var paymentRemarks = table.find('tr').eq(i).find('td:eq(15)').text();
        a.paymentRemarks = paymentRemarks;


        result.data.push(a);
    }


    var obj = JSON.stringify(result);

    $.ajax({
        url: "/statistics/updateReceivables",
        type: "post",
        data: obj,
        // datatype: "json",
        contentType: 'application/json;charset=UTF-8',
        success: function (data) {
            console.log("修改成功");
        }
    });
    // });
}


function prevent_reloading() {
    var pendingRequests = {};
    jQuery.ajaxPrefilter(function (options, originalOptions, jqXHR) {
        var key = options.url;
        console.log(key);
        if (!pendingRequests[key]) {
            pendingRequests[key] = jqXHR;
        } else {
            //jqXHR.abort();    //放弃后触发的提交
            pendingRequests[key].abort();   // 放弃先触发的提交
        }
        var complete = options.complete;
        options.complete = function (jqXHR, textStatus) {
            pendingRequests[key] = null;
            if (jQuery.isFunction(complete)) {
                complete.apply(this, arguments);
            }
        };
    });
}