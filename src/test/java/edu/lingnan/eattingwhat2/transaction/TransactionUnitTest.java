package edu.lingnan.eattingwhat2.transaction;


import edu.lingnan.eattingwhat2.service.OrderingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TransactionUnitTest{

    @Autowired
    private OrderingService orderingService;



    @Test
    public void testTransactionRequire() throws Exception {
        this.orderingService.insertIntoOrdering();
    }


}
