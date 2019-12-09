package com.unicom.esums.cucumber.stepdefs;

import com.unicom.esums.EsumsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EsumsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
