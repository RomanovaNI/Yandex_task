package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {

        this.wd = wd;
    }

    public void refresh() {
        wd.navigate().refresh();
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void switchToNextTab() {
        List<String> availableTab = new ArrayList<>(wd.getWindowHandles());
        if (!availableTab.isEmpty()) {
            wd.switchTo().window(availableTab.get(1));
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
