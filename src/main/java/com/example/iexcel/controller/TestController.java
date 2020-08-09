package com.example.iexcel.controller;

import com.github.houbb.heaven.util.nio.PathUtil;
import com.github.houbb.iexcel.util.ExcelHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {


    @RequestMapping("/test")
    public void test() {
        final String filePath = PathUtil.getAppTestResourcesPath() + "/excelHelper.xls";
        List<User> models = User.buildUserList();
        // 直接写入到文件
        ExcelHelper.write(filePath, models);
    }

}
