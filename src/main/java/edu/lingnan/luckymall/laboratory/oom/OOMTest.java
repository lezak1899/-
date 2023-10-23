package edu.lingnan.luckymall.laboratory.oom;


import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import edu.lingnan.luckymall.modules.customer.entity.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/public")
public class OOMTest {

    /**
     * 触发OOM
     * @return
     */
    @PostMapping("/oom")
    public String oom() {
//        return "oom";
        List<Customer> myList = new ArrayList<>();
        while (true) {
            Customer customer = new Customer();
            int i =1;
            customer.setId(i++);
            customer.setName(UUID.randomUUID().toString());
            myList.add(customer);
        }
    }
}
