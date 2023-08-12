package edu.lingnan.eattingwhat.redis;


import edu.lingnan.eattingwhat.common.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisUnitTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void redisTest(){
        this.redisService.setValue("lezak_name","lezak");
        System.out.println(this.redisService.getValue("money"));
    }


}
