package cn.edu.zju.crm4learning.service;

import cn.edu.zju.crm4learning.pojo.ExcelInputBean;

import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public interface ExcelService {

    int excel2Database(List<ExcelInputBean> excelInputBeans);
}
