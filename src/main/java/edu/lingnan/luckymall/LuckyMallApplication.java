package edu.lingnan.luckymall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
@EnableJms
public class LuckyMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckyMallApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return super.configure(builder);
//    }

}
