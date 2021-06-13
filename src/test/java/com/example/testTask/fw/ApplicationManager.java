package com.example.testTask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
    public WebDriver wd;
    SearchHelper search;
    FilterHelper filter;


    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://yandex.ru/");

        search=new SearchHelper(wd);
        filter=new FilterHelper(wd);
    }

    public SearchHelper search() {
        return search;
    }

    public FilterHelper filter() {
        return filter;
    }

    public void stop() {
        wd.quit();
    }
}
