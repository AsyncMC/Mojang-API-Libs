package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/Name History-report-json/Name History.json",
 "json:./report/Skin Operations-report-json/Skin Operations.json",
 "json:./report/Security question-answer-report-json/Security question-answer.json",
 "json:./report/Miscellaneous-report-json/Miscellaneous.json",
 })
public class PkmstTest {
}