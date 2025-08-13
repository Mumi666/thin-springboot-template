package org.mumi.weblogweb;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mumi.weblog.common.domain.DOs.UserDO;
import org.mumi.weblog.common.domain.mapper.UserMapper;
import org.mumi.weblogweb.controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("test");
        log.error("test error");
        log.warn("test warn");
    }

    @Test
    void insertUser() {
        UserDO userDO = UserDO.builder().username("李四").password("123456").createTime(new Date()).updateTime(new Date()).isDeleted(false).build();

        userMapper.insert(userDO);
    }

}
