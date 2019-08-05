package test.cn.edu.zju.crm4learning.service.impl;


import cn.edu.zju.crm4learning.mapper.TbCustomerMapper;
import cn.edu.zju.crm4learning.mapper.TbOrderMapper;
import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbCustomerExample;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

import java.io.IOException;
import java.util.List;

/**
 * TbCustomerServiceImpl Tester.
 *
 * @author Richarc Lee
 * @version 1.0
 * @since <pre>08/03/2019</pre>
 */
public class TbOrderServiceImplTest extends BaseJunit4Test {

    @Autowired
    private TbCustomerMapper tbCustomerMapper;

    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Test
    public void testInsert() {
//        TbOrder tbOrder = new TbOrder(
//                "20190804", new Date(), "1", "李航", "11111111111", "cusaddrd", "PEVA", "red", "oo", "aa", 5d, "bb", "cc"
//                , new BigDecimal("3"), new BigDecimal("3"), "bb"
//        );
//        TbOrder tbOrder = new TbOrder(
//                "20190804", "a", "1", "李航"
//                , "11111111111", "cusaddrd", "PEVA"
//                , "red", "oo", "aa", "5"
//                , "bb", "cc"
//                ,"3", "4", "bb"
//        );
//        tbOrderMapper.insert(tbOrder);

    }

    @Test
    public void testGetCustomers() throws Exception {
        TbCustomerExample customerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomIdIsNotNull();
        List<TbCustomer> customers = tbCustomerMapper.selectByExample(customerExample);
    }


    @Test
    public void testGetLastOrderId() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");
        String print = fmt.print(now);
        System.out.println(print);
//        String s = tbOrderMapper.selectLastOrderNumber("20190801__");
        String s = tbOrderMapper.selectLastOrderNumber(print + "__");

        System.out.println(s);
    }

    @Test
    public void testHttp() {
        String url = "http://localhost:8080/customer/getCustomers";
        HttpGet request = new HttpGet(url);
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
