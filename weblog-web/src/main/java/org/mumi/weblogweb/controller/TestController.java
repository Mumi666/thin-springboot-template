package org.mumi.weblogweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.mumi.weblog.common.aspect.ApiOperationLog;
import org.mumi.weblog.common.enums.ResponseCodeEnum;
import org.mumi.weblog.common.exception.BizException;
import org.mumi.weblog.common.utils.Response;
import org.mumi.weblogweb.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public  Response test(@RequestBody @Validated User user) {
        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());
        return Response.success(user);
    }

    @GetMapping("/test2")
    public Response<String> test2() {
        throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);
    }

    @GetMapping("/test3")
    public Response<String> test3() {
        int i = 1 / 0;
       return Response.success();
    }
}
