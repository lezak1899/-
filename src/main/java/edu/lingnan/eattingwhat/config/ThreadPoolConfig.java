package edu.lingnan.eattingwhat.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * .【强制】线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式，这样的处理方
 * 式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
 * 说明：Executors 返回的线程池对象的弊端如下：
 * 1）FixedThreadPool 和 SingleThreadPool：
 * 允许的请求队列长度为 Integer.MAX_VALUE，可能会堆积大量的请求，从而导致 OOM。
 * 2）CachedThreadPool：
 * 允许的创建线程数量为 Integer.MAX_VALUE，可能会创建大量的线程，从而导致 OOM。
 * 3）ScheduledThreadPool：
 * 允许的请求队列长度为 Integer.MAX_VALUE，可能会堆积大量的请求，从而导致 OOM。
 */

@Configuration
@EnableAsync
public class ThreadPoolConfig {

    @Value("${threadpool.corePoolSize}")
    private int corePoolSize;

    @Value("${threadpool.maxPoolSize}")
    private int maxPoolSize;

    @Value("${threadpool.queueCapacity}")
    private int queueCapacity;

    //https://blog.csdn.net/qq_33204709/article/details/130353652
    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置线程池的核心线程数
        executor.setCorePoolSize(corePoolSize);
        // 设置线程池的最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 设置线程池的队列容量
        executor.setQueueCapacity(queueCapacity);

        // 其他属性设置...

        return executor;
    }

}
