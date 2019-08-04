package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.OrderMapper;
import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.OrderId;
import cn.edu.zju.crm4learning.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 感觉自己像个智障, json又转成list
     * 明明直接可以做的, 非要换到customer类里
     * 然后在用httpclient取...
     */
    @Override
    public List<Customer> getCustomers() {
        String url = "http://localhost:8080/customer/getCustomers";
        HttpGet request =  new HttpGet(url);
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpResponse response = httpClient.execute(request);
            String strCustomers = EntityUtils.toString(response.getEntity(), "UTF-8");
            ObjectMapper objectMapper = new ObjectMapper();
            List<Customer> customers = (List<Customer>)objectMapper.readValue(strCustomers, List.class);
            return customers;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OrderId getOrderId() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");
        String orderDay = fmt.print(now);

        // 数据库查数据
        String lastOrderId = orderMapper.selectLastOrderNumber(orderDay + "__");
        // 如果没查到
        if (lastOrderId.length() != 0) {
            String lastOrderNum = lastOrderId.substring(8);
            int intOrderNum = Integer.parseInt(lastOrderNum) + 1;
            String orderNum = String.format("%02d", intOrderNum);
            String orderId = orderDay + orderNum;
            return new OrderId(orderDay, orderNum, orderId);
        }
        String orderNum = "01";
        String orderId = orderDay + orderNum;
        return new OrderId(orderDay, orderNum, orderId);
    }
}
