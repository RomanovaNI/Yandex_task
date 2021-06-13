package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase {

    public SearchHelper(WebDriver wd) {
        super(wd);
    }

    public void selectElectronicalDepartment() {
        click(By.cssSelector("[href='/catalog--elektronika/54440']"));
    }

    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void typeInSearchInputField(String itemName) {
        type(By.cssSelector("#header-search"), itemName);
        click(By.cssSelector("[type='submit']"));
    }
}
