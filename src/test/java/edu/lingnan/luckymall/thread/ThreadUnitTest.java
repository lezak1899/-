package edu.lingnan.luckymall.thread;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ThreadUnitTest {

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    /**
     * 第一种：继承Thread类，重写run方法
     * 实际上，线程池是用来执行实现了Runnable接口的任务，而不是直接执行继承Thread类的线程类。因为线程池是基于任务的，
     * 它管理和复用线程，而不是直接创建和管理线程对象。
     */
    class MyThread extends Thread{
        public void run(){
            //编写自己的线程代码
            //Thread.currentThread表示当前代码段正在被哪个线程调用的相关信息
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Test
    public void UnitTest1(){
        MyThread myThread = new MyThread();
        myThread.setName("我是线程1");
        myThread.start();
        System.out.println(Thread.currentThread().toString());
    }


    /**
     * 第二种：实现Runnable接口：
     */
    @Test
    public void UnitTest2(){
        Runnable myRunable1 = new Runnable() {
            @Override
            public void run() {
                    System.out.println(Thread.currentThread().getName()+"->我是线程2");
            }
        };

        // 和 myRunable1的效果意义，只是用了Lambda表达式
        Runnable myRunable2 = (() -> {
            System.out.println(Thread.currentThread().getName()+"->我是线程2");
        });

        threadPoolTaskExecutor.submit(myRunable2);
        threadPoolTaskExecutor.shutdown();
//        threadPoolTaskExecutor.shutdownNow();
    }

    /**
     * 第三种：实现callable接口
     * 当我们需要在多线程中执行一个任务并返回结果时，可以使用Callable接口。
     * Callable接口是一个具有类型参数的泛型接口，它声明了一个call()方法，允许抛出异常并返回一个结果。
     */
    @Test
    public void UnitTest3() throws ExecutionException, InterruptedException {

        Callable myCallable = (()->{
            Integer sum=0;
            for (int i=0;i<100;i++){
                System.out.println(i);
                sum+=i;
            }
            return sum;
        });

        Future<Integer> future = threadPoolTaskExecutor.submit(myCallable);
        System.out.println("测试是否等待future的返回，才继续往下执行！事实证明并不会等待调用future前的代码块。");
        System.out.println(future.get());
        System.out.println("只等待用到了future后面的代码块！");
    }
}
