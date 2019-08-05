package cn.edu.zju.crm4learning.mapper;

import cn.edu.zju.crm4learning.pojo.TbPayment;
import cn.edu.zju.crm4learning.pojo.TbPaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPaymentMapper {
    int countByExample(TbPaymentExample example);

    int deleteByExample(TbPaymentExample example);

    int deleteByPrimaryKey(String paymentOrderId);

    int insert(TbPayment record);

    int insertSelective(TbPayment record);

    List<TbPayment> selectByExample(TbPaymentExample example);

    TbPayment selectByPrimaryKey(String paymentOrderId);

    int updateByExampleSelective(@Param("record") TbPayment record, @Param("example") TbPaymentExample example);

    int updateByExample(@Param("record") TbPayment record, @Param("example") TbPaymentExample example);

    int updateByPrimaryKeySelective(TbPayment record);

    int updateByPrimaryKey(TbPayment record);
}