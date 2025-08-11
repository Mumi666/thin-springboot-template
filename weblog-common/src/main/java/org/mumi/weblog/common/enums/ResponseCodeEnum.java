package org.mumi.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.mumi.weblog.common.exception.BaseExceptionInterface;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {
    SYSTEM_ERROR("10000", "出错啦，后台小哥正在努力修复中..."),
    PARAM_ERROR("10001", "参数错误"),

    PRODUCT_NOT_FOUND("20000", "商品找不到")
    ;

   private String errorCode;

   private String errorMessage;
}
