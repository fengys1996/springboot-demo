package com.dlut;

import com.dlut.config.BookSettings;
import com.dlut.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 1.他会自动扫描同级包下面的Bean
 * 2.关闭特定的注解需要exclude参数
 * 3.如果修改console口的banner,要在resource下面新建banner.txt文件进行修改
 * 4.java -jar xx.jar --server.port=9090 来指定端口号
 */
@RestController
@EnableJpaRepositories("com.dlut")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//查到资料说:@EnableConfigurationProperties在@SpringBootApplication里包括
@EnableConfigurationProperties
/**
 * 此处由于xml文件未编写,所以会导致错误
 */
//@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
public class Application
{
    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/index")
    String index()
    {
        return "book name is:" + bookName + "  and book author is:" + bookAuthor;
    }

    @Autowired
    private BookSettings bookSettings;

    @RequestMapping("/index1")
    String index1()
    {
        return "book name is:" + bookSettings.getName() + "  and book author is:" + bookSettings.getAuthor();
    }

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloService")
    String HelloService() throws Exception
    {
        return helloService.getMsg();
    }


    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Application.class);
        //此处用到了枚举,但是对枚举的概念不是很熟
        app.setBannerMode(Banner.Mode.OFF);
        app.run();
        //SpringApplication.run(Application.class,args);
    }
}
