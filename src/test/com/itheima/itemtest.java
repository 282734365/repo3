package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class itemtest {


    @Test
    public void findbyid(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ItemsService bean = ca.getBean(ItemsService.class);
        Items findbyid = bean.findbyid(1);
        System.out.println(findbyid);


    }
}
