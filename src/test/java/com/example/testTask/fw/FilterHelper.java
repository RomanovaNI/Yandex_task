package com.example.testTask.fw;

import com.example.testTask.models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterHelper extends HelperBase {


    public FilterHelper(WebDriver wd) {
        super(wd);
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet']["+number+"]//h3")).getText();
    }

    public void filterItem(Item item) {
        click(By.cssSelector("[href='/catalog--"+ item.getItemType() +"']"));
        //click(By.cssSelector("[data-id='button-all']"));
        //Actions actions=new Actions(wd);
        // actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        type(By.cssSelector("#glpricefrom"), item.getPriceFrom());
        type(By.cssSelector("#glpriceto"), item.getPriceTo());
        click(By.xpath("//span[text()='"+ item.getBrand() +"']"));

    }
}
