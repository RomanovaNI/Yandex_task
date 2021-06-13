package com.example.testTask.tests;

import com.example.testTask.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void SetUp() {
        app.init();

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
    }

}
