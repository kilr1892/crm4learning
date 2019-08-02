package cn.edu.zju.crm4learning.mapper;

import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.CustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String customId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String customId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}