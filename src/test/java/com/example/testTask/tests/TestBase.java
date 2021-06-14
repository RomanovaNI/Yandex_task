package com.example.testTask.tests;

import com.example.testTask.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    Logger logger= LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void SetUp(Method m) {
        app.init();
        logger.info("Start test " +m.getName());

    }

    @AfterMethod(enabled = true)
    public void tearDown(Method m) {
        app.stop();
        logger.info("Stop test " + m.getName());
    }

}
