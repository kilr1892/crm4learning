package test.easy.excel;

import cn.edu.zju.crm4learning.pojo.ExcelInputBean;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.*;
import java.util.List;

public class ExcelUtils {
    /**
     * @param is   导入文件输入流
     * @param clazz Excel实体映射类
     * @return
     */
    public static List<ExcelInputBean> readExcel(InputStream is, Class clazz){

        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(is);
            // 解析每行结果在listener中处理
            ExcelListener listener = new ExcelListener();
            ExcelReader excelReader = EasyExcelFactory.getReader(bis, listener);
            excelReader.read(new Sheet(1, 1, clazz));
            List<ExcelInputBean> datas = listener.getDatas();
            return datas;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     *
     * @param os 文件输出流
     * @param clazz Excel实体映射类
     * @param data 导出数据
     * @return
     */
    public static Boolean writeExcel(OutputStream os, Class clazz, List<? extends BaseRowModel> data){
        BufferedOutputStream bos= null;
        try {
            bos = new BufferedOutputStream(os);
            ExcelWriter writer = new ExcelWriter(bos, ExcelTypeEnum.XLSX);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0,clazz);
            writer.write(data, sheet1);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //1.读Excel
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\Java_Project\\idea\\crm4learning\\src\\test\\java\\total.xlsx");
//            Boolean flag = ExcelUtils.readExcel(fis, ExcelInputBean.class);
//            System.out.println("导入是否成功："+flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //2.读Excel
/*        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("F:\\Java_Project\\idea\\crm4learning\\src\\test\\java\\export.xlsx");
            //FileOutputStream fos, Class clazz, List<? extends BaseRowModel> data
            List<ExcelInputBean> list = new ArrayList<>();
            for (int i = 0; i < 5; i++){
                ExcelInputBean excelEntity = new ExcelInputBean();
                System.out.println(("我是名字" + i));
                list.add(excelEntity);
            }
            Boolean flag = ExcelUtils.writeExcel(fos,ExcelInputBean.class , list);
            System.out.println("导出是否成功："+flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }
}