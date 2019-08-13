function updateReceivables() {
    var currentRow;
    $("#tableAll").on('click', function () {
        // 当前行号
        currentRow = event.srcElement.parentElement.parentElement.rowIndex;
        // currentRow += 1;
        // 所有行数
        var currentRowLength = $("#tableAll").find('tr').length;
        for (i = currentRow; i < currentRowLength; i++) {
            // td:eq(9)切割工   td:eq(10)税点  td:eq(11)冲帐  td:eq(12)进项金额  td:eq(13)应收款=
            var orderTotalPrice = $("#tableAll").find('tr').eq(i).find('td:eq(8)').text();
            if (orderTotalPrice == "") {
                orderTotalPrice = 0;
            }
            var orderCuttingWage = $("#tableAll").find('tr').eq(i).find('td:eq(9)').text();
            if (orderCuttingWage == "") {
                orderCuttingWage = 0;
            }
            var orderTaxPoint = $("#tableAll").find('tr').eq(i).find('td:eq(10)').text();
            if (orderTaxPoint == "") {
                orderTaxPoint = 0;
            }
            var orderStrike = $("#tableAll").find('tr').eq(i).find('td:eq(11)').text();
            if (orderStrike == "") {
                orderStrike = 0;
            }
            var paymentInputMoney = $("#tableAll").find('tr').eq(i).find('td:eq(12)').text();
            if (paymentInputMoney == "") {
                paymentInputMoney = 0;
            }

            if (i == 1) {
                var lastShowEveryReceivables = 0;
            } else {
                var lastShowEveryReceivables = $("#tableAll").find('tr').eq(i - 1).find('td:eq(13)').text();
            }
            var showEveryReceivables = Number(lastShowEveryReceivables) + Number(orderTotalPrice) + Number(orderCuttingWage)
                + Number(orderTaxPoint) + Number(orderStrike) - Number(paymentInputMoney);
            $("#tableAll").find('tr').eq(i).find('td:eq(13)').text(showEveryReceivables);
        }
    });

}