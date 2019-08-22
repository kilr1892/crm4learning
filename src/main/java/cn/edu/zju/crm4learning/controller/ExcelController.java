package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.annotation.Token;
import cn.edu.zju.crm4learning.pojo.ExcelInputBean;
import cn.edu.zju.crm4learning.service.ExcelService;
import cn.edu.zju.crm4learning.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Excel 导入导出controller.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller

public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @Token(save = true)
    @RequestMapping("/excel")
    public String showUploadExcelPage(Model model) {
        return "excel2db";
    }

    @Token(remove = true)
    @RequestMapping("/excel/input")
    public String excelToDataBase(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        String originalFilename = file.getOriginalFilename();
        // 后缀名
        String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 创建临时文件
        File tempFile = File.createTempFile("tmp", null);
        file.transferTo(tempFile);

        // 临时文件转为输入流
        InputStream inputStream = new FileInputStream(tempFile);
        List<ExcelInputBean> excelInputBeans = ExcelUtils.readExcel(inputStream, ExcelInputBean.class);
        int size = excelInputBeans.size();
        int count = excelService.excel2Database(excelInputBeans);

        model.addAttribute("size", size);
        model.addAttribute("count", count);

//        return "forward:/excel";
        return "excel2db";
    }
}
