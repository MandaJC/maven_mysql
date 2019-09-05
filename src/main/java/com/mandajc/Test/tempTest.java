package com.mandajc.Test;

import com.mandajc.domain.Items;

import java.util.ArrayList;
import java.util.List;

public class tempTest {
    public static void main(String[] args) {
        TestArray();
    }
    public static void TestArray(){
        List<Items> itemsList = new ArrayList<Items>();
        Items items = new Items(1,"a");
        itemsList.add(items);
        Items items1 = new Items(2,"b");
        itemsList.add(items);
        Items[] items2 = itemsList.toArray(new Items[itemsList.size()]);
        for (Items items3 : items2) {
            System.out.println(items3);
        }
    }
}
