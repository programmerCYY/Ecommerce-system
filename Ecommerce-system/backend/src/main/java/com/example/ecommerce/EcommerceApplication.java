package com.example.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//这是正常Spring boot启动的main函数，记得把pom.xml的（删除嵌入式tomcat依赖）删除啊！！！气死我了
@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }
}

/*
//这是部署到tomcat的主函数，记得把configuration换成下面的main函数，然后在pom.xml里加上 删除嵌入式tomcat插件的依赖
@SpringBootApplication
class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
*/
