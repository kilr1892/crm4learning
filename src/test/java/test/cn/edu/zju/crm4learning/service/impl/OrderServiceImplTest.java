package test.cn.edu.zju.crm4learning.service.impl;


import cn.edu.zju.crm4learning.mapper.CustomerMapper;
import cn.edu.zju.crm4learning.mapper.OrderMapper;
import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.CustomerExample;
import cn.edu.zju.crm4learning.pojo.Order;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * CustomerServiceImpl Tester.
 *
 * @author Richarc Lee
 * @version 1.0
 * @since <pre>08/03/2019</pre>
 */
public class OrderServiceImplTest extends BaseJunit4Test {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderMapper orderMapper;

    /**
     * Method: getCustomers()
     */
    @Test
    public void testGetCustomers() throws Exception {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomIdIsNotNull();
        List<Customer> customers = customerMapper.selectByExample(customerExample);
    }


    @Test
    public void testGetLastOrderId() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");
        String print = fmt.print(now);
        System.out.println(print);
//        String s = orderMapper.selectLastOrderNumber("20190801__");
        String s = orderMapper.selectLastOrderNumber(print+"__");

        System.out.println(s);
    }

    @Test
    public void testHttp() {
        String url = "http://localhost:8080/customer/getCustomers";
        HttpGet request =  new HttpGet(url);
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpResponse response = httpClient.execute(request);
            String s = EntityUtils.toString(response.getEntity(), "UTF-8");
            HttpEntity entity = response.getEntity();
            System.out.println("#####################################");
            System.out.println("#####################################");
            System.out.println("#####################################");
            System.out.println("#####################################");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
