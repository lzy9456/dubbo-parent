package my.dubbo.provider;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * @Description Hello world!
 *  sprintboot2.3 + dubbo2.7.7 + mybatis plus3.1.0
 *
 * @Author _lizy
 * @Date 2020/10/18 17:22
 */
@EnableDubbo
@EnableAutoConfiguration
@ComponentScan("my.dubbo.provider")
@MapperScan("my.dubbo.provider.dao")
public class DubboProviderApp
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DubboProviderApp.class, args);
    }
}
