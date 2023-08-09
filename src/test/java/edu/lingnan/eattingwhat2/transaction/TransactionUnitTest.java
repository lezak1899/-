package edu.lingnan.eattingwhat2.transaction;

import edu.lingnan.eattingwhat2.service.DishesService;
import edu.lingnan.eattingwhat2.service.OrderingDishesService;
import edu.lingnan.eattingwhat2.service.OrderingService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


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
