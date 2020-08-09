package com.example.iexcel.test;

import com.example.iexcel.controller.User;
import com.github.houbb.heaven.util.nio.PathUtil;
import com.github.houbb.iexcel.util.ExcelHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestController {
    @Test
    public void test() {
        final String filePath = PathUtil.getAppTestResourcesPath() + "/excelHelper.xls";
        List<User> models = User.buildUserList();
        // 直接写入到文件
        ExcelHelper.write(filePath, models);
    }
}
