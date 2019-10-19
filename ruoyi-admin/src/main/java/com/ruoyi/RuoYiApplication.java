package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
//        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
//                " .-------.       ____     __        \n" +
//                " |  _ _   \\      \\   \\   /  /    \n" +
//                " | ( ' )  |       \\  _. /  '       \n" +
//                " |(_ o _) /        _( )_ .'         \n" +
//                " | (_,_).' __  ___(_ o _)'          \n" +
//                " |  |\\ \\  |  ||   |(_,_)'         \n" +
//                " |  | \\ `'   /|   `-'  /           \n" +
//                " |  |  \\    /  \\      /           \n" +
//                " ''-'   `'-'    `-..-'              \n" +
//                "项目主页：https://gitee.com/racsu/RuoYi-Oracle，你的star和fork，都是作者前进的动力\n" +
//                "框架BUG描述清楚并提交：https://gitee.com/racsu/RuoYi-Oracle/issues，链接发群里，群号：22271299，作者优先答复。");
    }
}