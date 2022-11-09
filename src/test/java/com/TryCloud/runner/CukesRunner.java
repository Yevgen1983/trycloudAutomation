package com.TryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin={ "html:target/cucumber-report.html" ,
                    "rerun:target/rerun.txt" ,
                     "pretty"

            },

            features ="src/test/resources/feautures",
            glue ="com/TryCloud/stepdefinitions",
            tags ="@US2",
            dryRun = false,
            publish=true

    )
    public class CukesRunner {
    }

