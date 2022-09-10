package com.telran.scheduler.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestsBase{

    @Test
    public void loginPositiveTest() {
        app.getUser().login("neuer@gmail.com","Neuer2021");
    }
}
