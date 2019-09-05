package com.mandajc.test;

import com.mandajc.dao.ItemsDao;
import com.mandajc.dao.impl.ItemsDaoImpl;
import com.mandajc.domain.Items;
import org.junit.Test;

import java.util.List;

public class ItemsTest {
    @Test
    public void findAll() throws  Exception{
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();
        for (Items items : list) {
            System.out.println(items.getName());
        }
    }
}
