package cn.edu.zju.crm4learning.utils;

import cn.edu.zju.crm4learning.pojo.ExcelInputBean;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

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
public class ExcelListener extends AnalysisEventListener {

    //自定义用于暂时存储data。
    //可以通过实例获取该值
    private List<ExcelInputBean> datas = new ArrayList<>();


    @Override
    public void invoke(Object object, AnalysisContext context) {
//        System.out.println("当前行：" + context.getCurrentRowNum());
//        System.out.println(object);
        datas.add((ExcelInputBean) object);//数据存储到list，供批量处理，或后续自己业务逻辑处理。
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
//        datas.clear();//解析结束销毁不用的资源
    }

    public List<ExcelInputBean> getDatas() {
        return datas;
    }

    public void setDatas(List<ExcelInputBean> datas) {
        this.datas = datas;
    }
}
