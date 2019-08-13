package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.TbOrderMapper;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.pojo.TbOrderExample;
import cn.edu.zju.crm4learning.pojo.TbOrderId;
import cn.edu.zju.crm4learning.service.TbOrderService;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

//    /**
//     * 感觉自己像个智障, json又转成list
//     * 明明直接可以做的, 非要换到customer类里
//     * 然后在用httpclient取...
//     */
//    @Override
//    public List<TbCustomer> getCustomers() {
//        String url = "http://localhost:8080/customer/getCustomers";
//        HttpGet request = new HttpGet(url);
//        HttpClient httpClient = new DefaultHttpClient();
//        try {
//            HttpResponse response = httpClient.execute(request);
//            String strCustomers = EntityUtils.toString(response.getEntity(), "UTF-8");
//            ObjectMapper objectMapper = new ObjectMapper();
//            List<TbCustomer> customers = (List<TbCustomer>) objectMapper.readValue(strCustomers, List.class);
//            return customers;
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    @Override
    public TbOrderId getOrderId() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");
        String orderDay = fmt.print(now);

        // 数据库查数据
        String lastOrderId = tbOrderMapper.selectLastOrderNumber(orderDay + "__");
        // 如果没查到
        if (lastOrderId == null) {
            String orderNum = "01";
            String orderId = orderDay + orderNum;
            return new TbOrderId(orderDay, orderNum, orderId);
        } else {
            String lastOrderNum = lastOrderId.substring(8);
            int intOrderNum = Integer.parseInt(lastOrderNum) + 1;
            String orderNum = String.format("%02d", intOrderNum);
            String orderId = orderDay + orderNum;
            return new TbOrderId(orderDay, orderNum, orderId);
        }
    }

    @Override
    public void addOrder(TbOrder tbOrder) {
        tbOrderMapper.insertSelective(tbOrder);
    }

    @Override
    public List<TbOrder> getTodayOrders() {
        TbOrderExample tbOrderExample = new TbOrderExample();
        TbOrderExample.Criteria criteria = tbOrderExample.createCriteria();
        criteria.andOrderDateEqualTo(new Date());

        List<TbOrder> tbOrders = tbOrderMapper.selectByExample(tbOrderExample);
        return tbOrders;
    }

    @Override
    public List<TbOrder> getAllOrders() {
        TbOrderExample tbOrderExample = new TbOrderExample();
        List<TbOrder> tbOrders = tbOrderMapper.selectByExample(tbOrderExample);
        return tbOrders;
    }
}
