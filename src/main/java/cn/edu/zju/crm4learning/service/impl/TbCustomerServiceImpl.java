package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.TbCustomerMapper;
import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbCustomerExample;
import cn.edu.zju.crm4learning.service.TbCustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单表实现类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class TbCustomerServiceImpl implements TbCustomerService {

    @Autowired
    private TbCustomerMapper tbCustomerMapper;

    @Override
    public List<TbCustomer> getCustomers() {
        TbCustomerExample customerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomIdIsNotNull();
        List<TbCustomer> customers = tbCustomerMapper.selectByExample(customerExample);
        return customers;
    }

    @Override
    public String getCustomerPhone(String customerName) {
        TbCustomerExample customerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomNameEqualTo(customerName);
        List<TbCustomer> customers = tbCustomerMapper.selectByExample(customerExample);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String customersJson = objectMapper.writeValueAsString(customers);
            return customersJson;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
