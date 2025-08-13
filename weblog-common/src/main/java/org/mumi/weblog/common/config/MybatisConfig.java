package org.mumi.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.mumi.weblog.common.domain")
public class MybatisConfig {
}
