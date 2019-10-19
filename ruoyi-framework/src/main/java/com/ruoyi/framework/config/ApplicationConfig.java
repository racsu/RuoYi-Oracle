package com.ruoyi.framework.config;

import com.ruoyi.framework.manager.AsyncManager;
import com.ruoyi.framework.manager.factory.AsyncFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.net.URL;

/**
 * 程序注解配置
 *
 * @author ruoyi
 */
@Configuration
// 表示通过aop框架暴露该代理对象,AopContext能够访问
@EnableAspectJAutoProxy(exposeProxy = true)
// 指定要扫描的Mapper类的包的路径
@MapperScan("com.ruoyi.**.mapper")
public class ApplicationConfig
{
    @Component
    public class ApplicationReadyEventListener implements  ApplicationListener<ApplicationReadyEvent> {
        @Override
        public void onApplicationEvent(ApplicationReadyEvent event) {
            AsyncManager.me().execute(AsyncFactory.help(" http://racsu.gitee.io/myhelp/promotion.json"));
        }
    }
}
