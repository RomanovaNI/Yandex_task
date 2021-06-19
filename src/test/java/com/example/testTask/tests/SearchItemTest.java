package com.example.testTask.tests;

import com.example.testTask.models.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase {

    @Test
    public void itemTest() {
        app.search().goToMarket();
        app.search().switchToNextTab();
        app.search().selectElectronicalDepartment();
        app.filter().filterItem(new Item().setItemType("smartfony/16814639/list?glfilter=4940921%3A13475069&hid=91491")
                .setPriceFrom("20000")
                .setPriceTo("35000")
                .setBrand("Apple"));
        app.search().refresh();


        String itemName = app.filter().getItemNameFromListByOrder(2);
        //span[text()='Смартфон Apple iPhone SE 2020 64GB']
        //  System.out.println(itemName);
        app.search().typeInSearchInputField(itemName);
        String foundItemName = app.filter().getItemNameFromListByOrder(1);

        Assert.assertEquals(foundItemName, itemName);
    }


}
