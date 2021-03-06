package com.example.testTask.fw;

import com.example.testTask.models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterHelper extends HelperBase {


    public FilterHelper(WebDriver wd) {
        super(wd);
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][\"+number+\"]//h3")).getText();
        //*[@data-autotest-id='product-snippet']["+number+"]//h3
       // "//div[@class='_2Qo3ODl0by _1eVTqI-ogb cia-vs']/article["+ number +"]/div[4]//h3"
    }


   /* public String foundItem(){
        return wd.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div[4]/div/div[1]/div/div[1]/div/article[3]/div[4]/div[1]/h3")).getText();
    }*/

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
