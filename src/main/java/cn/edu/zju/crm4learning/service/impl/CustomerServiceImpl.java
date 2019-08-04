package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.CustomerMapper;
import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.CustomerExample;
import cn.edu.zju.crm4learning.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomers() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomIdIsNotNull();
        List<Customer> customers = customerMapper.selectByExample(customerExample);
        return customers;
    }

    @Override
    public String getCustomerPhone(String customerName) {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomNameEqualTo(customerName);
        List<Customer> customers = customerMapper.selectByExample(customerExample);

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
