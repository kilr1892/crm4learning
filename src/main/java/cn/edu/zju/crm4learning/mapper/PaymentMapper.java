package cn.edu.zju.crm4learning.mapper;

import cn.edu.zju.crm4learning.pojo.Payment;
import cn.edu.zju.crm4learning.pojo.PaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentMapper {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(String paymentOrderId);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(String paymentOrderId);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}