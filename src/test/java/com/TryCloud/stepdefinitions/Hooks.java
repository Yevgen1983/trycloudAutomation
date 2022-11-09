package com.TryCloud.stepdefinitions;

import com.TryCloud.utilities.Driver;
import org.junit.AfterClass;

public class Hooks {
    @AfterClass
            public void setup(){
        Driver.closeDriver();
}}
