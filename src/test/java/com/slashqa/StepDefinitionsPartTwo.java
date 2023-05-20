package com.slashqa;
import com.slashqa.utils.SessionUtils;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;


public class StepDefinitionsPartTwo {
    SessionUtils session;
    public StepDefinitionsPartTwo(SessionUtils sessionUtils) {
        super();
        session = sessionUtils;
    }

    @Then("the user verifies that the string stored in the session is {string}")
    public void verifyVariable(String expectedValue){
        assertEquals(expectedValue, session.get(session.TEST_KEY));
    }
}