package edu.lingnan.eattingwhat2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class Eattingwhat2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eattingwhat2Application.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return super.configure(builder);
//    }

}
