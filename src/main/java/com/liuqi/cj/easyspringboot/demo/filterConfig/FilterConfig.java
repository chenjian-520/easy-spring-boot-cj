package com.liuqi.cj.easyspringboot.demo.filterConfig;/**
 * @author John
 * @since 2022/4/27 21:51
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cj
 * @version 1.0
 * @since 2022/4/27 21:51
 */
@Configuration
@ConditionalOnProperty(prefix = "filter", name = "loginFilter", havingValue = "true")
public class FilterConfig {


    /**
     * prefix为配置文件中的前缀,
     * name为配置的名字
     * havingValue是与配置的值对比值,当两个值相同返回true,配置类生效.
     *
     * @return FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean getFilterRegistration() {
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean(new MyFilter());
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setName("myFilter");
        filterRegistration.setOrder(0);
        return filterRegistration;
    }
}